package com.howtodoinjava.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.howtodoinjava.demo.model.EmployeeVO;

public class EmployeeVOTest {

	EmployeeVO evo = new EmployeeVO();

	Integer id = new Integer(1);
	String firstName = "Michael";
	String lastName = "J";
	
	public EmployeeVOTest(){
			evo.setId(id);
			evo.setFirstName(firstName);
			evo.setLastName(lastName);
	}
	
	@Test
	public void getIdTest(){
		assertTrue("Verify id", evo.getId().equals(id));
	}
	
	@Test
	public void getFirstNameTest(){
		assertTrue("Verify first name", evo.getFirstName().equals(firstName));
	}
	
	@Test
	public void getLastNameTest(){
		assertTrue("Verify last name", evo.getLastName().equals(lastName));
	}
	
	@Test
	public void toStringTest(){
		String str = "EmployeeVO [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + "]";
		
		assertTrue("Verify toString method.",str.equals(evo.toString()));
	}
}
