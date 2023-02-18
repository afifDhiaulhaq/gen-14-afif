

import modul.BelahKetupat;
import modul.Lingkaran;
import modul.Persegi;
import modul.Segitiga;

/**
 * @author asus
 *
 */
public class BidangDatar {

	public static void main(String[] args) {
		
//		inisisi Segitiga
		Segitiga[] segitiga = new Segitiga[] {
				new Segitiga(10,20),
				new Segitiga(11,21),
				new Segitiga(12,22),
				new Segitiga(13,23),
		};
		
//		untuk menampilakn Array nilai setiap segitiga beserta nilai luas dan keliling
		for(int i  = 0 ; i<segitiga.length;i++) {
			System.out.println("Segitiga ke-"+(i+1)+"\n"+segitiga[i]);
			System.out.println("Luas : "+segitiga[i].setLuas());
			System.out.println("Keliling : "+segitiga[i].setKeliling()+"\n");
		}
//		inisisi Persegi
		Persegi[] persegi = new Persegi[] {
				new Persegi(10,20),
				new Persegi(11,21),
				new Persegi(12,22),
				new Persegi(13,23),

		};
		
//		untuk menampilakn Array nilai setiap Persegi beserta nilai luas dan keliling
		for(int i  = 0 ; i<segitiga.length;i++) {
			System.out.println("Persegi ke-"+(i+1)+"\n"+persegi[i]);
			System.out.println("Luas : "+persegi[i].setLuas());
			System.out.println("Keliling : "+persegi[i].setKeliling()+"\n");
		}

//		inisisi Lingkaran
		Lingkaran[] lingkaran = new Lingkaran[] {
				new Lingkaran(10),
				new Lingkaran(12),
				new Lingkaran(13),
				new Lingkaran(14),

		};
		
//		untuk menampilakn Array nilai setiap Lingkaran beserta nilai luas dan keliling
		for(int i  = 0 ; i<segitiga.length;i++) {
			System.out.println("Lingkaran ke-"+(i+1)+"\n"+lingkaran[i]);
			System.out.println("Luas : "+lingkaran[i].setLuas());
			System.out.println("Keliling : "+lingkaran[i].setKeliling()+"\n");
		}
		
//		inisiasi Belah ketupat
		BelahKetupat[] belahketupat = new BelahKetupat[] {
				new BelahKetupat(30,20,10),
				new BelahKetupat(31,21,11),
				new BelahKetupat(32,22,12),
				new BelahKetupat(33,23,13)

		};
		
//		untuk menampilakn Array nilai setiap Belah Ketupat beserta nilai luas dan keliling
		for(int i  = 0 ; i<segitiga.length;i++) {
			System.out.println("Belah Ketupat ke-"+(i+1)+"\n"+belahketupat[i]);
			System.out.println("Luas : "+belahketupat[i].setLuas());
			System.out.println("Keliling : "+belahketupat[i].setKeliling()+"\n");
		}

	}

}
