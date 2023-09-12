package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import entity.Employee;

public class EmployeeService {

	List<Employee> empList = new ArrayList<>();

	public EmployeeService() {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setAdmin(true);
		e1.setFirstName("Pratiksha");
		e1.setLastName("Trivedi");
		e1.setUserName("riya");
		e1.setPassword( "123");
		empList.add(e1);
		Employee e2= new Employee();
		e2.setId(2);
		e2.setAdmin(false);
		e2.setFirstName("Niraj");
		e2.setLastName("Kaushal");
		e2.setUserName("nrj");
		e2.setPassword( "4321");
		empList.add(e2);
		Employee e3= new Employee();
		e3.setId(2);
		e3.setAdmin(false);
		e3.setFirstName("Jiya");
		e3.setLastName("Soni");
		e3.setUserName("ram");
		e3.setPassword( "321");
		empList.add(e3);
		
		System.out.println(empList);
	}

	public List<Employee> getList() {
		return empList;
	}

	public Employee login(String userName, String password) {
	Optional<Employee> authenticEmp= empList.stream().filter(employee -> employee.getUserName().equals(userName)  && employee.getPassword().equals(password)).findFirst();	
	if(authenticEmp.isPresent())
	{
	return 	authenticEmp.get();
	}
		return null;
	}
}