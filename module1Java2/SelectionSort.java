package module1Java2;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++) {
        	System.out.print(arr[i]+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9, 5, 7, 4, 8, 1, 15, 2, 6};
		selectionSort(arr);

	}

}
