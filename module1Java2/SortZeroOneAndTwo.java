package module1Java2;

public class SortZeroOneAndTwo {
	public static void sort012(int[] arr){
    	//Your code goes here
        int n = arr.length;
        int nz = 0;
        int nt = n-1, temp = 0, i= 0;
        while(i<nt){
            if(arr[i]==0){
                temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                nz++;
                i++;
                
                
            }
            else if(arr[i]==2){
                temp = arr[i];
                arr[i] = arr[nt];
                arr[nt] = temp;
                nt--;

            }
            else {
            	i++;
            	continue;
            }
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,0,1,2,0,2,1,1,0,0,2};
		sort012(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+"");
		}
		

	}

}
