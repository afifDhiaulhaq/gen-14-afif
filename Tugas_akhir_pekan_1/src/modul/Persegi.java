package modul;

/**
 * @author asus
 *
 */
public class Persegi {
	
	private double panjang;
	private double lebar;
	
	public Persegi(double panjang, double kebar) {
		super();
		this.panjang = panjang;
		this.lebar = kebar;
	}

	public double getPanjang() {
		return panjang;
	}

	public void setPanjang(double panjang) {
		this.panjang = panjang;
	}

	public double getLebar() {
		return lebar;
	}

	public void setLebar(double lebar) {
		this.lebar = lebar;
	}

	@Override
	public String toString() {
		return "Persegi [panjang=" + panjang + ", lebar=" + lebar + "]";
	}
	
//	fungsi untuk menentukan nilai luas persegi
	public double setLuas() {
		double luas;
		luas = panjang * lebar;
		return luas;
	}
	
//	fungsi untuk menentukan nilai keliling persegi
	public double setKeliling() {
		double keliling;
		keliling = (panjang*2)+(lebar*2);
		return keliling;
	}
	
}
