
/**
 * @author asus
 *
 */
public class HurufVokal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="aku belajar pemograman";
		String vocal = "aiueo";
		int count=0;
		
		for(int i = 0;i<vocal.length();i++) {
			for(int j = 0;j<text.length();j++) {
				if(vocal.charAt(i)==text.charAt(j)) {
					count++;
				}
				
			}
			System.out.println(vocal.charAt(i)+" = "+count);
			count =0;
		}
	}

}
