package day3.instanceofexample;

import java.util.Collection;

public class TicketMainApp {

	//You can't use the instanceof operator to test across two different class hierarchies.
		public static void main(String[] args) {
			ConfirmedTicket tkt = new ConfirmedTicket();
			//if(tkt instanceof Ticket) {
			if(! (tkt instanceof Object)) {	
				System.out.println("tkt is an instance of Ticket");
			}else {
				System.out.println("tkt is not an instance of Ticket");
			}
			System.out.println("*************************************************");
			if(tkt instanceof Ticket) {	
				System.out.println("tkt is an instance of Ticket");
			}else {
				System.out.println("tkt is not an instance of Ticket");
			}
			System.out.println("#######################################################");
			if(tkt instanceof ConfirmedTicket) {	
				System.out.println("tkt is an instance of Ticket");
			}else {
				System.out.println("tkt is not an instance of Ticket");
			}
			System.out.println("*************************************************");
			if(tkt instanceof Collection) {	
				System.out.println("tkt is an instance of Ticket");
			}else {
				System.out.println("tkt is not an instance of Ticket");
			}
			/**
			if() {
				
			}else if() {
				
			}else if() {
				
			}else {
				
			}**/
			
		}

}
