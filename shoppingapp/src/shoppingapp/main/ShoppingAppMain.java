package shoppingapp.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import shoppingapp.pojo.Customer;
import shoppingapp.pojo.Order;
import shoppingapp.pojo.Product;

public class ShoppingAppMain {

	public static void main(String[] args) {
		// TODO
		// Create a customer object
		Customer customer = new Customer();
		System.out.println(customer);
		customer.setId(10l);
		customer.setName("Naveen");
		customer.setTier(2);
		System.out.println(customer);

		// At the time of creating an instance we are setting data to fileds
		Customer customer1 = new Customer(11l, "Pandey", 1);
		System.out.println(customer1);

		Product prod1 = new Product();
		Product prod2 = new Product();
		Product prod3 = new Product();
		Product prod4 = new Product();
		prod1.setId(1l);
		prod1.setName("Lenovo Laptop ThinkPad W45");
		prod1.setCategory("Laptop");
		prod1.setPrice(155555.00);

		prod2.setId(2l);
		prod2.setName("Mac Book Pro 16GB 1TB");
		prod2.setCategory("Laptop");
		prod2.setPrice(185555.00);

		prod3.setId(3l);
		prod3.setName("iPhone 14 Pro Max");
		prod3.setCategory("Mobile Phone");
		prod3.setPrice(135555.00);

		prod4.setId(4l);
		prod4.setName("Samsung Galaxy S6");
		prod4.setCategory("Mobile Phone");
		prod4.setPrice(166552.00);

		System.out.println(prod1);
		// Here we are creating an array list referred by variable productList
		// This productList is a container or collection of type List which
		// will store Product type objects
		List<Product> productList = new ArrayList<Product>();
		productList.add(prod1);//prod1 will be stored at index position 0
		productList.add(prod2);//prod2 will be stored at index position 1
		productList.add(prod3);//prod3 will be stored at index position 2
		productList.add(prod4);//prod4 will be stored at index position 3
		System.out.println("*******************Product List Begin***********************");
		System.out.println(productList);
		System.out.println("*******************Product List End*******************");
		
		Order order1 = new Order();
		order1.setId(1l);
		order1.setStatus("Placed");
		order1.setOrderDate(LocalDate.now());
		order1.setDeliveryDate(LocalDate.now().plusDays(1));
		order1.setProducts(productList);
		order1.setCustomer(customer1);
		
		System.out.println(order1);

	}

}
