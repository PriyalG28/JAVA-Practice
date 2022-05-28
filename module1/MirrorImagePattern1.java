package module1;
import java.util.Scanner;
public class MirrorImagePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	            while(i<=n){
	            	int spaces = 1;
	            	while(spaces <= n - i) {
	            		System.out.print(' ');
	            		spaces++;
	            	}
	            	int stars = 1;
	            	while(stars<=i) {
	            		System.out.print('*');
	            		stars++;
	            	}
	            	System.out.println();
	            	i++;
	               
	        }

	}

}
