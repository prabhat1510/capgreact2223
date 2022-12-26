package firstjavaproject.main;

import firstjavaproject.data.Address;
import firstjavaproject.data.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		//employee is a reference variable referring to object of Employee type
		//Using new keyword we are invoking No arg constructor of Employee class
		Employee employee = new Employee();
		System.out.println(employee);
		
		Employee employee1 = new Employee(1,"Prabhat");
		System.out.println(employee1);
		
		employee1.setEmpId(15);
		employee1.setEmpName("Budhiraja");
		
		System.out.println(employee1);
		System.out.println(employee1.getEmpName());
		
		Address addr = new Address();
		addr.setCity("Bengaluru");
		addr.setCountry("India");
		addr.setHouseNo(6);
		addr.setState("Karnataka");
		addr.setStreet("Whitefield");
		addr.setPinCode(560067l);
		System.out.println(addr);
		
		Employee emp = new Employee();
		emp.setAddress(addr);
		emp.setEmpId(11);
		emp.setEmpName("Rashmika");
		System.out.println(emp);
	}

}
