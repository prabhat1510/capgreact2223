package day7.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {

	public static void main(String[] args) {
		FileWriter fw;
		try {
			fw = new FileWriter("D:\\capgreact2223\\output\\writer.txt");
			fw.write("Hello Everyone Good Morning");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader fr;
		try {
			fr = new FileReader("D:\\capgreact2223\\output\\writer.txt");
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.println((char) i);
			}

			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File doesn't exits at given location");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
