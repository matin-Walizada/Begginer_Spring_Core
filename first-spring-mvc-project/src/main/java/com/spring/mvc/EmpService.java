package com.spring.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

//<bean id="Employeea" class="com.service.EmployeeService"></bean>
//Spring 2.x
@Service("empService") //@Repository , @Component ,@Controller
public class EmpService {
	
	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean isAuth(String username,String password) {
		List<Employee> EmployeeList = jdbcTemplate.query("select id,name,brand,doe from Employee_service_tbl where name =? and brand=?", 
				new Object[] {username,password},
				new BeanPropertyRowMapper(Employee.class));
		return EmployeeList.size() > 0;
	}
	
	public String updateByName(String name,String brand){
		int rows=jdbcTemplate.update("update Employee_service_tbl set brand=? where name = ?",brand,name);
		String result="Number of row update is  = "+rows;
		return result;
	}
	
	public String deleteByName(String name){
		int rows=jdbcTemplate.update("delete from Employee_service_tbl where name = ?",name);
		String result="Number of row deleted is  = "+rows;
		return result;
	}
	
	public void save(Employee Employee){
		String sql="insert into Employee_service_tbl(name,brand,doe) values(?,?,?)";
		Object[] data={Employee.getName(),Employee.getBrand(),Employee.getDoe()};
		jdbcTemplate.update(sql,data);
	}
	
	public List<Employee> findAll(){
		List<Employee> EmployeeList=jdbcTemplate.query("select id,name,brand,doe from Employee_service_tbl", new BeanPropertyRowMapper(Employee.class));
		return EmployeeList;
	}

}