package firstjavaproject.main;

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
	}

}
