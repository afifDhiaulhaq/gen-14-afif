package ChildClass;

import ParentClass.BangunRuang;

public class Lingkaran extends BangunRuang {
	private double radius;
	private double phi = 3.14;
	public Lingkaran(double radius) {
		super();
		this.radius = radius;
	}
	public Lingkaran() {
		super();
		// TODO Auto-generated constructor stub
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getPhi() {
		return phi;
	}
	public void setPhi(double phi) {
		this.phi = phi;
	}
	
	
	
//	public String luas() {
//		luas = phi*radius*radius;
//		return "Luas lingkaran : "+luas;
//	}
	
	
	
	@Override
	public String toString() {
		return "Lingkaran [radius=" + radius + ", phi=" + phi + "]";
	}
	public void nilaiLuas() {
		this.setLuas(phi*radius*radius);
	}
}
