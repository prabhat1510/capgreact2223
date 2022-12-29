package shoppingapp.pojo;

import java.time.LocalDate;
import java.util.List;

public class Order {
	private Long id;
	private String status;
	//In Java to handle dates we have date and time API
	//java.util.Date - before java 1.8
	//new Date and Time API was introduces in Java 1.8 is LocalDate and LocalDateTime 
	//inside java.time package
	private LocalDate orderDate; 
	private LocalDate deliveryDate;
	/**
	 * Order can have more than one products
	 * So to store more than one products we need some storage during the execution of the program
	 * Java has provided us in memory storage concept i.e. known as collections
	 * One of the most commonly used collection is List which is an java interface and it has different implementations
	 * such as ArrayList, LinkedList etc.
	 * 
	 * Below List is going to store Product type element or objects which will be referred by variable products
	 */
	//HAS-A also know as composition
	private List<Product> products;
	//HAS-A also know as composition
	private Customer customer;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products,
			Customer customer) {
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.products = products;
		this.customer = customer;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", products=" + products + ", customer=" + customer + "]";
	}
	
	
}	
