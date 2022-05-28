package module1;
import java.util.Scanner;
public class HalfPyramidPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Java Program to Print the Half Diamond Star Pattern
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of rows: ");
		        int n=sc.nextInt(); 
		        int i=1;
		        int j; 
		        do 
		        {
		            j=1;
		            do
		            {
		               System.out.print("*"); 
		            }while(++j<=i); 
		            System.out.println();
		        } while(++i<=n); 
		        i=n-1; 
		        do 
		        {
		            j=1;
		            do
		            {
		                System.out.print("*"); 
		            }while(++j<=i); 
		            System.out.println(); 
		        } while(--i>0); 
		     }
		

}
