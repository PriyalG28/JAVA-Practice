package module1;
import java.util.Scanner;
public class AllPrimeNumbers {
	public static void func1(int a,int b)
	{
	    int ans=1;
	    for(int i=0;i<b;i++)
	    {
	        ans*=a;
	    }
	    System.out.print(ans);
	}
	public static void main (String[] args) {
	    func1(2,5);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        int flag = 0;
//        if(0<=n && n<=5){
//        	if(n>1) {
//        		System.out.println(2);
//        	}
//            for(int i=3; i<=n; i++){
//                for(int j=2;j<i; j++){
//                    if(i%j == 0){
//                        flag = 1;
//                        break;
//                    }
//                    }
//                    if(flag == 0){
//                        System.out.println(i);  
//                    }
//                    flag = 0;
//                }
//                
//            }
//            
//        }


	}

