package shoppingapp.main;

import java.util.ArrayList;
import java.util.List;

import shoppingapp.exceptions.CustomerNotFoundException;
import shoppingapp.pojo.Customer;

public class ShoppingAppWithExceptionsHandling {

	public static void main(String[] args) {
		// Create a customer object
		Customer customer = new Customer();
		customer.setId(10l);
		customer.setName("Naveen");
		customer.setTier(2);
		
		// Create a customer object
		Customer customer1 = new Customer();
		customer1.setId(11l);
		customer1.setName("Shashank");
		customer1.setTier(2);
		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer1);
		customerList.add(customer);
		//searchCustomerWithId
		searchCustomerWithId(10l,customerList);
		System.out.println(customerList);
	}//main closed

	private static void searchCustomerWithId(Long id,List<Customer> customerList) {
		
		for(Customer cust :customerList) {//for loop start
			try {
				if(cust.getId() == id) {
					System.out.println("Customer record exist with id --"+id);
				}else {
						throw new CustomerNotFoundException();
					}
			}catch(CustomerNotFoundException cnfe) {
				System.out.println("Customer data not found");
			}

	}}

}
