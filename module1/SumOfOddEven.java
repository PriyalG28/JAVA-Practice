package module1;
import java.util.Scanner;
public class SumOfOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num, sum;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int odd=0, even=0;
        int i=0;
        if(0<=n && n<=100000000){
        	while(i<n){
        		num = 0 ;
        		sum = 0;
                if(num%2 == 0){
                	sum += num;
                }
                else{
                	odd += num;
                }
        		i += 1;
        }
        
        }
        

	}

}
