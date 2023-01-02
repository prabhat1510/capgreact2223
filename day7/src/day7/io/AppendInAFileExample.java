package day7.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInAFileExample {

	public static void main(String[] args) {
	 	try {
			String data = "It's interesting to learn IO";
			String filePath = "D:\\capgreact2223\\output\\writerFile.txt";
			File file = new File(filePath);
			if (!file.exists()) {
				boolean flag = file.createNewFile();
				if(flag) {
					System.out.println("New file created");
				}

			}
			FileWriter fw= new FileWriter(file,true);
			//FileWriter fw= new FileWriter(file,false); // it will override as second parameter append is false
			BufferedWriter buffWriter = new BufferedWriter(fw);
			buffWriter.write(data);
			buffWriter.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
