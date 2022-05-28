package module1;
import java.util.Scanner;

public class CheckPrimality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc = new Scanner(System.in);
        int n, div=2; 
        n = sc.nextInt();
        boolean isPrime = true;
        while(div <= n/2) {
        	if(n%div == 0) {
        		isPrime = false;
        	} div += 1;
        }
        if(isPrime) {
        	System.out.println("Number is prime!");
        }else {
        	System.out.println("Number is not prime!");
        }
	}

}
