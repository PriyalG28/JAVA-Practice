package module1;
import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner s =  new Scanner(System.in);
	        int n = s.nextInt();
	        if(0<=n && n<=50){
	            int i = 1;
	            
	            while(i<=n){
	            	if(i == 1) {
	            		System.out.println('*');
	            	}
	                
	                System.out.print('*');
	                int j = 1; 
	                while(j<=i){
	                    System.out.print(j);
	                    j++;
	                }
	               
	                int dec = i-1;
	                while(dec>0) {
	                	System.out.print(dec);
	                	dec--;
	                }
//	                int k = n-1;
//	                while(k>0) {
//	                	if( k == 1) {
//	                		System.out.println('*');
//	                	}
//	                	
//                		System.out.print('*');
//                		int p = k;
//                		while(p>0) {
//                		System.out.print(p);
//	                		
//	                	}
//	                }
	                
	                System.out.print('*');
					System.out.println();
					i++;

	                }

	            }
	        }
	        
            }
     



