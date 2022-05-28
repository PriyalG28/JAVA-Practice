package module1;
import java.util.Scanner;
public class ReverseOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int currentNumber = 0;
	        if(0<=n && n<=100000000){
	            int rev = 0;
	            while(n != 0){
	                currentNumber = n%10;
	                n /= 10;
	                rev = rev*10 + currentNumber;
	                
	            }
	            System.out.println(rev);

	        }

	}

}
