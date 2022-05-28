package module1Java2;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int mid = (start + end)/2 ;
        while(start <= end){ 
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] < x){
                start = mid + 1; 
                mid = (start + end)/2 ;
            }
            else{
                end = mid - 1;
                mid = (start + end)/2;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,6,7,9,12,16,25};
		int n = binarySearch(arr, 22);
		System.out.println(n);

	}

}
