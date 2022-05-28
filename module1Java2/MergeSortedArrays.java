package module1Java2;

public class MergeSortedArrays {
    public static int[] merge(int arr1[], int arr2[]) {
    	//Your code goes here
        int m = arr1.length;
        int n = arr2.length;
        int arr3[] = new int[m+n];
        int i = 0, j = 0;
        int k = 0;
        
        while(i<m && j<n) {
        	if(arr1[i]<=arr2[j]) {
        		arr3[k] = arr1[i];
        		k++;
        		i++;
        	}
        	else{
        		arr3[k] = arr2[j];
        		k++;
        		j++;
        	}

        	
        }
        while(i<m) {
        	arr3[k] = arr1[i];
        	i++; k++;
        	
        }
        while(j<n) {
        	arr3[k] = arr2[j];
        	j++; k++;
        	
        }
        return arr3;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 4, 6, 10, 13};
		int arr2[] = {2, 5, 7, 9};
		int arr3[] = merge(arr1, arr2);
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		

	}

}
