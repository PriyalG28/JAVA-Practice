package module1;
import java.util.Scanner;
public class ZeroesAndStarsPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i, k;
        
        for(k = n; k>0; k--) {
        	for( i = 1; i<=n-i; i++)
        		System.out.print(0);
        	System.out.print("*");
        	for( i = k-1; i>0; i--)
        		System.out.print(0);
        	System.out.print("*");
        	for( i = 1; i<=n-i; i++)
        		System.out.print(0);
        	System.out.println();
        	
        	
        }
		

	}

}
