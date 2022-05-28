package module1;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        if(0<=n && n<=100000){
	            long ans = 0;
	            long pv = 1;
	            int currentNumber = 0;
	            for(int i = 1; i != 0; i = n){
	                currentNumber = n % 2;
	                n /= 2;
	                ans = ans+ currentNumber * pv ;
	                pv *= 10;

	                
	            }
	            System.out.print(ans);
	        }


	}

}
