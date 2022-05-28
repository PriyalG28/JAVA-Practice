package module1;
import java.util.Scanner;
public class CharacterPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 0;
	        if(0<=n && n<=26){
	            while(i<=n){
	               char nthChar = (char)('A'+ n - i);
	                int j = 1; 
	                while(j<=i){
	                    System.out.print(nthChar);
						nthChar = (char)(nthChar + 1);
	                    j++;
	                }
	                System.out.println();
					i++;
	            }
	        }

	}

}
