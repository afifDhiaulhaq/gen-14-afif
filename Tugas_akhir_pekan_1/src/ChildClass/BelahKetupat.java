package ChildClass;

import ParentClass.BangunRuang;

public class BelahKetupat extends BangunRuang {
	private double diagonal1;
	private double diagonal2;
	private double sisi;
	
	
	public BelahKetupat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
		super();
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
		this.sisi = sisi;
	}


	public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public double getSisi() {
		return sisi;
	}

	public void setSisi(double sisi) {
		this.sisi = sisi;
	}
	
	

//	public String luas() {
//		luas = (diagonal1*diagonal2)/2;
//		return "luas belah ketupat: "+luas;
//	}
//	
//	public String keliling() {
//		keliling = sisi*4;
//		return "keliling belah ketupat : "+keliling;
//	}
	
	@Override
	public String toString() {
		return "BelahKetupat [diagonal1=" + diagonal1 + ", diagonal2=" + diagonal2 + ", sisi=" + sisi + "]";
	}

	public void nilaiLuas() {
		this.setLuas((diagonal1*diagonal2)/2);
	}

}
