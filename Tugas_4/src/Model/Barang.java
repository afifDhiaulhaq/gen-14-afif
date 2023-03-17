package Model;

import java.io.Serializable;

/**
 * @author Afif
 *
 */
public class Barang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nama;
	private int harga;
	private int persediaan;

	public Barang() {
		super();
	}
	public Barang(String nama, int harga, int persediaan) {
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public void setHarga(int harga) throws Exception {
		if (harga>0) {
			this.harga = harga;			
		} else {
			throw new Exception("Harga tidak boleh negatif");
		}
	}
	
	public int getPersediaan() {
		return persediaan;
	}
	
	public void setPersediaan(int persediaan) {
		this.persediaan = persediaan;
	}
	@Override
	public String toString() {
		return "nama : " + nama + ", harga : " + harga + ", persediaan : " + persediaan +"\n";
	}
	

	
}