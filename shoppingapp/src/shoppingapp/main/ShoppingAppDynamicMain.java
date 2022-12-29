package shoppingapp.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import shoppingapp.pojo.Customer;
import shoppingapp.pojo.Order;
import shoppingapp.pojo.Product;

public class ShoppingAppDynamicMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("************Welcome to Shopping App**************");
		System.out.println("**********Enter product details *******************");
		System.out.println("*****How many products you want to add?*************");
		int numOfProductsToBeadded = sc.nextInt();
		int counter=0;
		List<Product> productList = new ArrayList<Product>();
		do {
			System.out.println("*****************Enter the product details***************");
			System.out.println("*****Enter product id ---*****");
			Long id = sc.nextLong();
			sc.nextLine();
			System.out.println("*****Enter product name---*****");
			String name = sc.nextLine();
			System.out.println("*****Enter product category ---*****");
			String category = sc.nextLine();
			System.out.println("*****Enter product price ---*****");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			Product prod = new Product();
			prod.setId(id);
			prod.setName(name);
			prod.setCategory(category);
			prod.setPrice(price);
			
			//Storing it in list
			productList.add(prod);
			counter++;
			
		}while(counter < numOfProductsToBeadded);
		System.out.println(productList);
		
		System.out.println("*********************Enter Customer Details*******************");
		
		System.out.println("*************Enter customer id **************");
		Long custId = sc.nextLong();
		sc.nextLine();
		System.out.println("*************Enter customer name **************");
		String custName = sc.nextLine();
		
		System.out.println("*************Enter customer tier **************");
		Integer tier = sc.nextInt();
		sc.nextLine();
		
		Customer customer = new Customer();
		customer.setId(custId);
		customer.setName(custName);
		customer.setTier(tier);
		
		System.out.println("**************Enter Order details ***********************");
		System.out.println("*************Enter order id **************");
		
		Long orderId = sc.nextLong();
		sc.nextLine();
		System.out.println("*************Enter order status **************");
		String status = sc.nextLine();
		
		//Set order details to order object
		Order order = new Order();
		order.setId(orderId);
		order.setStatus("Placed");
		order.setOrderDate(LocalDate.now());
		order.setDeliveryDate(LocalDate.now().plusDays(1));
		order.setProducts(productList);
		order.setCustomer(customer);
		
		System.out.println("Order Details -----------------------------"+order);
	}

}
