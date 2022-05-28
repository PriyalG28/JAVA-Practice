package module1Java2;

public class RotateArray {
	public static void rotate(int[] arr, int d) {
    	//Your code goes here
		int n = arr.length;
		int temp[] = new int[d];
		for(int i=0; i<d; i++) {
			temp[i] = arr[i];
	
    }
		int k = 0;
		for(int j=d; j<n; j++) {
			arr[k] = arr[j];
			k++;
		}
		k = 0;
		for(int i=n-d; i<n; i++) {
			arr[i] = temp[k];
			k++;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		rotate(arr, 2);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		

	}

	}


