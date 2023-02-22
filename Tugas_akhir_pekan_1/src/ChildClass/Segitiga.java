package ChildClass;

import ParentClass.BangunRuang;

/**
 * @author asus
 *
 */
public class Segitiga extends BangunRuang {
	private double tinggi;
	private double alas;
	private double sisi1;
	private double sisi2;
	
	public Segitiga(double tinggi, double alas, double sisi1, double sisi2) {
		super();
		this.tinggi = tinggi;
		this.alas = alas;
		this.sisi1 = sisi1;
		this.sisi2 = sisi2;
	}
	

	public Segitiga() {
		super();
		// TODO Auto-generated constructor stub
	}



	public double getTinggi() {
		return tinggi;
	}



	public void setTinggi(double tinggi) {
		this.tinggi = tinggi;
	}



	public double getAlas() {
		return alas;
	}



	public void setAlas(double alas) {
		this.alas = alas;
	}



	public double getSisi1() {
		return sisi1;
	}



	public void setSisi1(double sisi1) {
		this.sisi1 = sisi1;
	}



	public double getSisi2() {
		return sisi2;
	}



	public void setSisi2(double sisi2) {
		this.sisi2 = sisi2;
	}

	@Override
	public String toString() {
		return "Segitiga [tinggi=" + tinggi + ", alas=" + alas + ", sisi1=" + sisi1 + ", sisi2=" + sisi2 + "]";
	}


	public void nilaiLuas() {
		this.setLuas((tinggi*alas)/2);
	}

//	@Override
//	public String luas() {
//		luas = (tinggi * alas)/2;
//		return "luas segitiga :"+luas;	
//	}
//	
//	public String keliling() {
//		keliling =(alas+sisi1+sisi1);
//		return "keliling segitiga : "+keliling;
//		
//	}
	
	
	
}
