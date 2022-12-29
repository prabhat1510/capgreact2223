package day3.arrays;

public class Student {
	
	private Integer studentId;
	private String studentName;
	private String city;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(Integer studentId, String studentName, String city) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.city = city;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + "]";
	}
	

}