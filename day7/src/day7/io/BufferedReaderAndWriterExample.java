package day7.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterExample {

	public static void main(String[] args) {
		try {
			//Writing the file
			FileWriter fw = new FileWriter("D:\\capgreact2223\\output\\writerFile.txt");
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write("Java's proivde IO related libraries in java.io packages");
			//buffWriter.append("It's interesting to append");
			buffWriter.close();
			
			//Reading the file
			FileReader fr = new FileReader("D:\\capgreact2223\\output\\writerFile.txt");
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
