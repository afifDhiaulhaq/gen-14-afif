import java.util.ArrayList;

import ChildClass.BelahKetupat;
import ChildClass.Lingkaran;
import ChildClass.Persegi;
import ChildClass.Segitiga;
import ParentClass.BangunRuang;

public class Main {

	public static void main(String[] args) {
		
		Segitiga segitiga = new Segitiga(10,10,20,20);
		Persegi persegi = new Persegi(10,20);
		Lingkaran lingkaran = new Lingkaran(10);
		BelahKetupat belahketupat = new BelahKetupat(10,20,30);
		
//		BangunRuang[] bangunruang = {segitiga,persegi,lingkaran,belahketupat}; 
		
//		for(int i = 0 ; i<bangunruang.length;i++) {
//			System.out.println(bangunruang[i].luas());
//		}
		
//		segitiga.nilaiLuas();
//		persegi.nilaiLuas();
//		lingkaran.nilaiLuas();
//		belahketupat.nilaiLuas();
//		
//		BangunRuang[] bangunruang = {segitiga,persegi,lingkaran,belahketupat}; 
//
//		for(int i = 0 ; i<bangunruang.length;i++) {
//			System.out.println(bangunruang[i].toString());
//			bangunruang[i].display();
//		}
		
		ArrayList<BangunRuang> ruangList = new ArrayList<BangunRuang>();
//		menambahkan member pada ArrayList
		ruangList.add(segitiga);
		ruangList.add(persegi);
		ruangList.add(lingkaran);
		
		
		System.out.println(ruangList+"\n");
		
//		menghilangkan
		ruangList.remove(2);
		
		System.out.println(ruangList+"\n");
		
//		mengakses
		BangunRuang ambil = ruangList.get(1);
		
		System.out.println(ambil);
		
//		method
		System.out.println(ruangList.size());
		System.out.println(ruangList.isEmpty());
		System.out.println(ruangList.contains(segitiga));
		System.out.println(ruangList.indexOf(persegi));

		
		

		
		
		
	}

}
