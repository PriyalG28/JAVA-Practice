package module1Java2;

public class Sort0and1 {
    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
int n = arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                for(int j=n-1; j>i; j--){
                    if(arr[j] == 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        
                    }
            }
                
            }
            
        }
        for(int i=0; i<n; i++) {
        	System.out.print(arr[i]+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0};
		sortZeroesAndOne(arr);

	}

}
