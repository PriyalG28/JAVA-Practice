package module1;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        if(0<=n && n<=1000000000){
            int ans = 0, currentNumber = 0, pv = 1;
            for(int i=1; i!=0; i=n){
                currentNumber = n % 10;
                n /= 10;
                ans = ans + currentNumber * pv ;
                pv *= 2;
                
            }
            System.out.println(ans);
        }
		

	}

}
