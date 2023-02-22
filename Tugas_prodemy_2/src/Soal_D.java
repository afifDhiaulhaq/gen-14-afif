import java.util.ArrayList;

public class Soal_D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;	
		ArrayList<Integer> ganjil = new ArrayList();
		
//		mendapatkan ganjil
		for(int g=0;g<n+n;g++) {
			if(g%2!=0) {
				ganjil.add(g);
			}
		}
		
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i == (n-1-j)) {
					System.out.print(ganjil.get(j));
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
