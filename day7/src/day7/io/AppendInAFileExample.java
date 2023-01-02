package day7.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendInAFileExample {

	public static void main(String[] args) {
		try {
			String data = "It's interesting to learn IO";
			
			File file = new File("D:\\capgreact2223\\output\\writerFile.txt");
			if (!file.exists()) {

				file.createNewFile();

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
