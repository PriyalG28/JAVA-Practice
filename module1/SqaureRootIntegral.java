package module1;
import java.util.Scanner;
public class SqaureRootIntegral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        long ans = 0;
        if(0<=n && n<=100000000){
            for(long i = 1; i <= n; i++){
                if(i*i <= n){
                    ans = i; 
                }
            }
            System.out.println(ans);
        }

	}

}
