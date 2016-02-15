package com.howtodoinjava.test;

import com.howtodoinjava.demo.dao.EmployeeDAOImpl;
import com.howtodoinjava.demo.model.EmployeeVO;
import com.howtodoinjava.demo.service.EmployeeManagerImpl;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;


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
    public void testEM(){
        EmployeeManagerImpl emi = new EmployeeManagerImpl();

        emi.getAllEmployees();
    }

    @Test
    public void testAllEmployee(){
        EmployeeDAOImpl empDAO = new EmployeeDAOImpl();
        List<EmployeeVO> le = empDAO.getAllEmployees();
        List<String> fnResult = new ArrayList<String>();

        fnResult.add("Lokesh");
        fnResult.add("Raj");
        fnResult.add("Jim");

        assertTrue("Employees number >= 3",le.size() >= 3);

        for(int i = 0; i < 3; i++){
            assertTrue("Employee first name verify: ", le.get(i).getFirstName().equals(fnResult.get(i)));
        }
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
