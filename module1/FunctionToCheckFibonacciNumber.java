package module1;
import java.util.Scanner;
public class FunctionToCheckFibonacciNumber {
	public static boolean checkMember(int n){
		
		
        if(0 <= n && n <= 10000){
            if(n == 0){
                return true;
            }
            else if (n == 1 || n == 2){
                return true;
            }
            else{
                int b = 2;
                int a = 1;
                int sum = 0;
                while(b<=n){
                    sum = a + b;
                    a = b;
                    b = sum;
                    if(sum == n){
                        return true;
                    }
                    
                }
            }   
        }
        return false;  
		 

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean r = checkMember(n);
		System.out.println(r);
		
		

	}

}
