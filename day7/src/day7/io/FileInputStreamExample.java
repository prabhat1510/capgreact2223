package day7.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		//InputStream and OutputStream api or classes to perform IO in your program
		//InputStream to read data from source and OutputStream to write data to destination
	//Read a byte from  a files
		File file = new File("D:\\capgreact2223\\output\\abc.txt");
		//FileInputStream fiss = new FileInputStream("D:\\capgreact2223\\output\\abc.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			//Reading character one by one from file
			System.out.println(fis.read());
			int i = fis.read();
			System.out.println(i);
			System.out.println((char)i);
			System.out.println("**************************************");
			//Reading all the character
			/**
			int f=0;
			while((f=fis.read())!=-1) {
				System.out.print((char)f);
			}**/
			//System.out.println(fis.readAllBytes());
			byte arr[] = fis.readAllBytes();
			int f=0;
			while(f<arr.length) {
				System.out.print((char)arr[f]);
				f++;
			}
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
