package firstjavaproject.data;

//class Employee
public class Employee {
	// Data members or fields or properties
	private int empId;
	private String empName;
	//HAS-A
	private Address address;
	
	// Default constructor or No Argument constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//Parameterized constructors
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	

}
