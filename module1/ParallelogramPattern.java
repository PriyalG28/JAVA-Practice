package module1;
import java.util.Scanner;
public class ParallelogramPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        if(0<=n && n<=50){
	            int i = 1;
	            while(i<=n){
	                int spaces=0;
	                while(spaces<i){
	                    if(spaces > 0){
	                        System.out.print(' ');
	                    }
	                    spaces++;
	                }
	                int j = 1;
	                while(j <= n){
	                    System.out.print('*');
	                    j++;
	                }
	                System.out.println();
					i++;
	            }
	        }
	        

	}

}
