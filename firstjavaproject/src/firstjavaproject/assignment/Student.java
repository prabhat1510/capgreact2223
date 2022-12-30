package firstjavaproject.assignment;

public class Student {
	private int id;
	private String fname;
	private double cgpa;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}

}
