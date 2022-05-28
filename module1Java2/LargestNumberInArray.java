package module1Java2;
import java.util.Scanner;
public class LargestNumberInArray {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter element for "+i+"th position: ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int LargestNumber(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		int largest = LargestNumber(arr);
		System.out.println(largest);
		
		

	}

}
