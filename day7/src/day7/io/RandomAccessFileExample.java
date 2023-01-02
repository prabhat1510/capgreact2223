package day7.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		String filePath = "D:\\capgreact2223\\output\\randomAccessFile.txt";
		String data = "Will take break after this example";
		int position = 5;
		int size = 10;
		
		// writeToAFile
		writeToAFile(filePath, data, position);
		// readFromAFile
		readFromAFile(filePath, position, size);
	}

	private static void readFromAFile(String filePath, int position, int size) {

		try {
			File file = new File(filePath);
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
			randomAccessFile.seek(8);
			byte[] bytes = new byte[size];
			randomAccessFile.read(bytes);
			System.out.println(new String(bytes));
			randomAccessFile.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void writeToAFile(String filePath, String data, int position) {
		try {
			File file = new File(filePath);
			RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
			randomAccessFile.seek(position);//seek the cursor position
			randomAccessFile.write(data.getBytes());
			randomAccessFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
