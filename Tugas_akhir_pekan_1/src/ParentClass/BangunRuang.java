package ParentClass;

/**
 * @author asus
 *
 */
public abstract class BangunRuang {
	
//	public double luas;
//	public double keliling;
//	
//	public String luas() {
//		return "";
//	}
//	
//	public String kelilling() {
//		return "";
//	}
	
	private double luas;
	
	public abstract void nilaiLuas();
	
	public void setLuas (double hasilLuas) {
		this.luas=+hasilLuas;
	}
	
	public void display() {
		System.out.println("Luas : "+luas);
	}
	
}
	
	
	
	
	

	
	
	
