package modul;

/**
 * @author asus
 *
 */
public class Segitiga {

	private double sisi;
	private double tinggi;
	
	public Segitiga(double sisi, double tinggi) {
		super();
		this.sisi = sisi;
		this.tinggi = tinggi;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}

	public double getTinggi() {
		return tinggi;
	}

	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	
	
	@Override
	public String toString() {
		return "Segitiga [sisi=" + sisi + ", tinggi=" + tinggi + "]";
	}


	//	fungsi untuk menentukan luas segitiga
	public double setLuas() {
		double luas = (sisi*tinggi)/2;
		return luas;
	}
	
//	fungsi untuk menentukan keliling segitiga
	/**
	 * @return
	 */
	public double setKeliling() {
		double keliling = (sisi+sisi+sisi);
		return keliling;
	}
	
	
	
	
}
