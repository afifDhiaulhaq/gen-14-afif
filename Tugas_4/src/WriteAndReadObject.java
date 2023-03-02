import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import Model.Barang;

/**
 * @author Afif
 *
 */
public class WriteAndReadObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		list untuk menyimpan barang
		List<Barang> barang = new ArrayList<>();
		
		barang.add(new Barang("Oreo",5000,10));
		barang.add(new Barang("Ultra",6000,12));
		barang.add(new Barang("SilverQueen",15000,20));
		barang.add(new Barang("Pocky",8000,30));

		
	try {
		FileOutputStream file = new FileOutputStream(new File("DaftarBarang.txt"));
		ObjectOutputStream object = new ObjectOutputStream(file);
		
//		menulis barang ke file Databarang.txt
		for(int i =0;i<barang.size();i++) {
			object.writeObject(barang.get(i));
		}
		
		object.close();
		file.close();
		
		FileInputStream fileInput = new FileInputStream(new File("DaftarBarang.txt"));
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		
		List<Barang> daftarBarang = new ArrayList<>();

//		measukan kedalam list dan membaca barang pada file DaftarBarang.txt
		for(int i=0;i<barang.size();i++) {
			daftarBarang.add((Barang) objectInput.readObject());
			System.out.println(daftarBarang.get(i).toString());
		}
		
		objectInput.close();
		fileInput.close();

		
	}catch(FileNotFoundException e) {
		System.out.println("file tidak ditemukan");
	}catch(IOException e) {
		System.out.println("Error initializing stream");
	}catch (ClassNotFoundException e) {		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		
	}

}
