package module1Java2;

public class ArrayIntersection {
    public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int n = arr1.length;
        int m = arr2.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr1[i] == arr2[j]){
                    arr2[j] = Integer.MIN_VALUE;
                    System.out.print(arr1[i]+" ");
                    break;
                }
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,6,8,5,4,3};
		int arr2[] = {2,3,4,7};
		intersections(arr1, arr2);

	}

}
