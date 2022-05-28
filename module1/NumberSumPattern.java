package module1;
import java.util.Scanner;
public class NumberSumPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        if(0<=n && n<=50){
//            int i = 1;
//            int sum = 0;
//            while(i<=n){
//                
//                int j = 1;
//                while(j<=i){
//                   System.out.print(j);
//                    if(j<i){
//                       System.out.print("+"); 
//                    }
//                   sum = sum + j;
//                	j++;
//                }
//                System.out.println("="+sum);
//                sum=0;
//				i++;
//
//            }
//        }
//	    Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        if(0<=n && n<=50){
//            int i = 0;
//            while(i<n){
//            	int j = 1;
//                
//            	int k = 2*i+1;
//                while(j<=n){
//                    System.out.print(k);
//                    k = k + 2;
//                    j++;
//                }
//                System.out.println();
//				i++;
//            }
//        }
		int a=5;
	    a+=5+(++a)+(a++);
	    System.out.print(a);
        

	}

}
