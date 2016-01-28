package com.howtodoinjava.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.EmployeeVO;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeVO> getAllEmployees() 
	{
		List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
		
		EmployeeVO vo1 = new EmployeeVO();
		vo1.setId(1);
		vo1.setFirstName("Lokesh");
		vo1.setLastName("Gupta");
		employees.add(vo1);
		
		EmployeeVO vo2 = new EmployeeVO();
		vo2.setId(2);
		vo2.setFirstName("Raj");
		vo2.setLastName("Kishore");
		employees.add(vo2);
		
		EmployeeVO vo3 = new EmployeeVO();
		vo3.setId(3);
		vo3.setFirstName("Jim");
		vo3.setLastName("Closure");
		employees.add(vo3);
		
		EmployeeVO vo4 = new EmployeeVO();
		vo4.setId(4);
		vo4.setFirstName("Michael");
		vo4.setLastName("Chang");
		employees.add(vo4);
		
		EmployeeVO vo5 = new EmployeeVO();
		vo5.setId(5);
		vo5.setFirstName("XIAO");
		vo5.setLastName("WANG");
		employees.add(vo5);
		
		return employees;
	}
}