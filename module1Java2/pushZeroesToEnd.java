package module1Java2;

public class pushZeroesToEnd {
    public static void pushZerosAtEnd(int[] arr) {
    	//Your code goes here
        int n = arr.length;
        int k = 0;
        for(int i=0; i<n; i++){
           
                if(arr[i] != 0){
                	int temp = arr[k];
                    arr[k] = arr[i];
                    arr[i] = temp;
                    
                    k++;
                }
          

        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 0, 4, 5, 0, 0 , 4, 1, 0};
		pushZerosAtEnd(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		

	}

}
