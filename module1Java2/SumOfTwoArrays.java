package module1Java2;

public class SumOfTwoArrays {
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i = arr1.length - 1;
        int j = arr2.length - 1;
//        int i = m-1;
//        int j = n-1;
        int carry = 0;
        int x = Math.max(i,j) + 1; 
        
		while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            output[x] = sum%10;
            carry = sum/10;
            i--;
            j--;
            x--;
            
        }
        while(i>=0){
            int sum = arr1[i]  + carry;
            output[x] = sum%10;
            carry = sum/10;
            i--;
            x--;
            
        }
        while(j>=0){
            int sum = arr2[j] + carry;
            output[x] = sum%10;
            carry = sum/10;
            j--;
            x--;
            
        }
        output[0] = carry;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 4, 6, 10, 13};
		int arr2[] = {2, 5, 7, 9};
		int x = Math.max(arr1.length, arr2.length)+1;
		int arr3 [] = new int[x] ;
		sumOfTwoArrays(arr1, arr2, arr3);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}

	}

}
