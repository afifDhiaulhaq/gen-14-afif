package ChildClass;

import ParentClass.BangunRuang;

/**
 * @author asus
 *
 */
public class Persegi extends BangunRuang {
	private double tinggi;
	private double lebar;
	public Persegi(double tinggi, double luas) {
		super();
		this.tinggi = tinggi;
		this.lebar = luas;
	}
	public Persegi() {
		super();
	}
	public double getTinggi() {
		return tinggi;
	}
	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}
	public double getlebar() {
		return lebar;
	}
	public void setLebar(double luas) {
		this.lebar = luas;
	}
	
	@Override
	public String toString() {
		return "Persegi [tinggi=" + tinggi + ", lebar=" + lebar + "]";
	}
	public void nilaiLuas() {
		this.setLuas(tinggi*lebar);
	}
	
//	public String luas() {
//		lebar = tinggi * lebar;
//		return "Luas persegi : "+luas;
//	}
//	
//	public String keliling() {
//		keliling = (tinggi*2)+(lebar*2);
//		return "keliling persegi : "+keliling;
//	}
	
	
	
	
}
