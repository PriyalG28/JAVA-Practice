package module1Java2;

public class SwapAlternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,3,6,12,4,32};
		for(int i=1; i<arr.length; i += 2) {
				int k = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = k;
			
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
