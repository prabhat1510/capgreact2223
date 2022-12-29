package day3.foreachexample;

public class Product {
	private Integer sku;
	private String description;
	private Integer qty;
	private Double price;
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", description=" + description + ", qty=" + qty + ", price=" + price + "]";
	}
	
}
