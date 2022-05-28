package module1Java2;

public class CheckRotationOfArray {

    public static int arrayRotateCheck(int[] arr){
    	//Your code goes here
    	int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]>arr[i+1]){
                return i+1;
            }
        }
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,6,7,1,2,3,4};
		int d = arrayRotateCheck(arr);
		System.out.println(d);

	}

}
