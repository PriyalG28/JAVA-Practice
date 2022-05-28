package module1Java2;

public class PairSum {
    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j] == x){
                    count++;
                }
            }
            
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,6,2,5,4,3,2,4};
		int x = 7;
		int num = pairSum(arr, x);
		
		System.out.println(num);
	}

}
