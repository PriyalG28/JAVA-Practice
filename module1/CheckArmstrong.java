package module1;
import java.util.Scanner;
public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String t = s.next();
        int n = s.nextInt();
        int sum = 0;
        int number = 1;
        int count = 0;
        int p = n;
        int k = n;
        while( p != 0) {
        	p /= 10;
        	count++;
        }
        while(n != 0){
        	int num = n%10;
        	System.out.println(count);
        	number = n%10;
            n /= 10;
            int prod = 1;
            while(count != 0){
                prod *= num;
                count--;  
            }
            System.out.println(prod);
            sum += prod;
            
        }
        if (k == sum) {
        	System.out.println(true);
        }
        else {
        	System.out.println(false);
        }



	}

}
