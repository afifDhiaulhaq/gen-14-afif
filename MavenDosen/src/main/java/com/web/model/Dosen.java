package com.web.model;

public class Dosen {
	private String kode_dosen;
	private String nama;
	public String getKode_dosen() {
		return kode_dosen;
	}
	public void setKode_dosen(String kode_dosen) {
		this.kode_dosen = kode_dosen;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public Dosen(String kode_dosen, String nama) {
		super();
		this.kode_dosen = kode_dosen;
		this.nama = nama;
	}
	public Dosen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dosen [kode_dosen=" + kode_dosen + ", nama=" + nama + "]";
	}
	
	
}
