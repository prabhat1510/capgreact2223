package shoppingapp.pojo;
//access modifier public , keyword class, name of the class
public class Customer {
	//properties or data member or fields
	//access modifier private , data type , identifiers or variable name
	private Long id;
	private String name;
	private Integer tier;
	
	//Constructors -- we need constructor to creat an object or an instance of a class
	//No argument constructor
	public Customer(){
		
	}
	//Parameterized constructor
	public Customer(Long id, String name, Integer tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}
	//Getter and Setter Methods
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTier() {
		return tier;
	}
	public void setTier(Integer tier) {
		this.tier = tier;
	}
	
	//Other methods its optional
	//toString
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
	
	
	
}
