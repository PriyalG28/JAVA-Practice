package module1Java2;

public class FindUnique {
	
    public static int findUnique(int[] arr){
		//Your code goes here
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int flag = 0;
            for(int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    flag++;
                }
            }
            if(flag==1){
                return arr[i];
            }
            
        }
        return arr[0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,6,6,3,1,5,3,2,7};
		int n = findUnique(arr);
		System.out.println(n);

	}

}
