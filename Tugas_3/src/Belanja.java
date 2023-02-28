import java.util.ArrayList;
import java.util.List;

/**
 * @author asus
 *
 */
public class Belanja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int uang = 5000; //inputan
		
		List<String> belanja = new ArrayList<>();  //menyimplan belanja
		
		
		while(uang>0) {
			if(uang>=7000) {
				uang-=7000;
				belanja.add("buahvita");
			}else if(uang>=6000) {
				uang-=6000;
				belanja.add("oreo");
			}else if(uang>=5000) {
				uang-=5000;
				belanja.add("tanggo");
			}else if(uang>=3000){
				uang-=3000;
				belanja.add("aqua");
			}
		}
		
		System.out.println("Barang termahal dapat dibeli : "+belanja.get(0));
//		jika dapat membeli lebih dari 1 item
		if(belanja.size()>1) {
			System.out.println("rekomendasi list :"+belanja);
		}

	}

	

}
