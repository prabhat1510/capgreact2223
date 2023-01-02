package day7.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialiazableExample {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(11);
		e.setEmpName("Rakesh");
		System.out.println(e);
		// Serialize an object e
		// Write an object into a file system
		File file = new File("D:\\capgreact2223\\output\\serializedObject.txt");

		try (FileOutputStream fos = new FileOutputStream(file); 
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			oos.writeObject(e);
			
			//Deserialize 
			Employee emp;
			emp = (Employee) ois.readObject();
			System.out.println("Deserialized -----"+emp);

		} catch (FileNotFoundException e1) {

			System.out.println(e1.getClass() + "---------------" + e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getClass() + "---------------" + e1.getMessage());
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
