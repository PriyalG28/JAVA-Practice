package module1Java2;

public class SecondLargestInArray {
	public static int secondLargestElement(int[] arr) {
    	//Your code goes here
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		int second_largest = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			if(arr[i]>largest ) {
				second_largest = largest;
				largest = arr[i];
				
		}
			else if(arr[i]>second_largest && arr[i]!=largest) {
				second_largest = arr[i];
			}
			else {
				return -12334567;
			}
		}
		return second_largest;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,3,4,5,1,3,67,2,45,11,67,33,4,2,0};
		int second_largest = secondLargestElement(arr);
		System.out.println(second_largest);

	}

}
