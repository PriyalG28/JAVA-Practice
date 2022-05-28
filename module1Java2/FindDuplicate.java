package module1Java2;

public class FindDuplicate {
	public static int duplicateNumber(int arr[]) {
    	//Your code goes here
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                
            }
            if(count == 2){
                return arr[i];
            }
        }
        return 0;
    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,6,6,3,1,5,3,2,7};
		int n = duplicateNumber(arr);
		System.out.println(n);

	}

}
