package chapter24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex14_ObjectInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Object.bin"))) {
			Ex12_Unit unit1 = (Ex12_Unit)ois.readObject();
			System.out.println(unit1.getName());
			Ex12_Unit unit2 = (Ex12_Unit)ois.readObject();
			System.out.println(unit2.getName());
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}