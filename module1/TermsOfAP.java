package module1;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        int series = 0;
        int flag = 0;
        if(1<=n && n<=1000){
            for(int i=1; flag<n; i++){
        	
        		series = 3 * i + 2;
        		if(series%4 == 0) {
        			continue;
        		}
        		else {
        			flag ++;
        			System.out.print(series+" ");
        		}
            	

                
            }
        }
		

	}

}
