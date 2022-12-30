package day5.stringexample;

import java.util.Objects;

public class Employee {
	private Integer empId;
	private String firstName;
	private String lastName;
	private String department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String firstName, String lastName, String department) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, empId, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		/**
		return Objects.equals(department, other.department) && Objects.equals(empId, other.empId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName);**/
		return (this.getEmpId() == other.getEmpId());
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}

}
