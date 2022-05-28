package module1;
import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        if(0<=n && n<=50){
            
            int i = 1;

            while(i<=n+1){
                
                if(i == 1) {
                	System.out.println('*');
                }
                else {

                System.out.print('*');
                int j = 1; 
                while(j<i){
                    System.out.print(j);
                    j++;
                }

                int dec = i-2;
                while(dec>0) {
                    System.out.print(dec);
                    dec--;
                }              
                System.out.print('*');
                System.out.println();}
                i++;

                }
            
            
		
            int p = n;

            while(p>0){
                
            	if (p == 1){
            		System.out.println('*');
            	}
            	else {
            		
                System.out.print('*');
                int q = 1; 
                while(q<p){
                    System.out.print(q);
                    q++;
                }

                int dec = p-2;
                while(dec>0) {
                    System.out.print(dec);
                    dec--;
                }	              
                System.out.print('*');
                System.out.println();}
                p--;

                }
            }
        }
}



