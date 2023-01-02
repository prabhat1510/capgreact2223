package day7.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromConsole {

	public static void main(String[] args) {
		try(InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);){
			System.out.println("Enter your salary---");
			Double salary = 1.0;
			while(salary!=0.0) {
			salary = Double.parseDouble(br.readLine());
			
			System.out.println("Salary ---" + salary);
			}
		}catch(NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception class name -----"+e.getClass()+"----message-----"+
			e.getMessage());
		}

	}

}
