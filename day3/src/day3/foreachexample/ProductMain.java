package day3.foreachexample;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {
			Product prod1 = new Product();
			Product prod2 = new Product();
			Product prod3 = new Product();
			Product prod4 = new Product();
			Product prod5 = new Product();
			
			prod1.setSku(111);
			prod1.setPrice(1555.55);
			prod1.setQty(5);
			prod1.setDescription("iPhone14 Pro");
			
			prod2.setSku(112);
			prod2.setPrice(1655.55);
			prod2.setQty(1);
			prod2.setDescription("Samsung Galaxy");
			
			prod3.setSku(113);
			prod3.setPrice(1255.55);
			prod3.setQty(2);
			prod3.setDescription("iPhone14 Pro Max");
			
			prod4.setSku(114);
			prod4.setPrice(1155.55);
			prod4.setQty(6);
			prod4.setDescription("iPhone13 Pro");
			
			prod5.setSku(116);
			prod5.setPrice(1055.55);
			prod5.setQty(7);
			prod5.setDescription("iPhone XR");
			
			Product[] products = new Product[5];
			products[0]=prod1;
			products[1]=prod2;
			products[2]=prod3;
			products[3]=prod4;
			products[4]=prod5;
			System.out.println(products[3]);
			System.out.println("***********************************************");
			int prodLength = products.length;	
			for(int index=0;index<prodLength;index++) {
				System.out.println(products[index]);
			}
			System.out.println("**********************output using for-each loop*************************");
			//for each prod in products
			for(Product prod : products) {
				System.out.println(prod);
			}
			System.out.println("**************************************************************");
			int arr[] = new int [5];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			arr[3]=4;
			arr[4]=5;
			
			for(int i: arr) {
				System.out.println(i);
			}
			
			
			System.out.println("*************************************************");
			List<Product> productList = new ArrayList<Product>();
			productList.add(prod1);
			productList.add(prod2);
			productList.add(prod3);
			productList.add(prod4);
			productList.add(prod5);
			
			
			
	}

}
