package modul;



/**
 * @author asus
 *
 */
public class Lingkaran {
	private double radius;
	final double phi = 3.14;
	
	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Lingkaran [radius=" + radius + "]";
	}
	
//	fungsi untuk menentukan nilai luas lingkaran
	public double setLuas() {
		double luas = phi*radius*radius;
		return luas;
	}
	
	public double setKeliling() {
		double keliling = 2*phi*radius;
		return keliling;
	}
}
