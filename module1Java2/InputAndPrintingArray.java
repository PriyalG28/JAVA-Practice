package module1Java2;
import java.util.Scanner;
public class InputAndPrintingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Elements of array are: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

}
