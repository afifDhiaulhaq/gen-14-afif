
public class Soal_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i == (n-1-j)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n ====================== \n");
		
		n = 5;
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || i == (n-1-j)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
