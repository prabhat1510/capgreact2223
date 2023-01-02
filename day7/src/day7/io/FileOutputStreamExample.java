package day7.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		// InputStream and OutputStream api or classes to perform IO in your program
		// InputStream to read data from source and OutputStream to write data to
		// destination
		// Write a byte in a file
		try {
			String word = "Good Morning";
			FileOutputStream fout = new FileOutputStream("D:\\capgreact2223\\output\\output.txt");
			fout.write(68);
			fout.write(65);
			
			byte bArr[] = word.getBytes();
			fout.write(bArr);
			fout.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
