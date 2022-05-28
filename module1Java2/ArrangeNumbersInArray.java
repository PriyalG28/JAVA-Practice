package module1Java2;

import java.util.Scanner;

public class ArrangeNumbersInArray {
	public static void printArray(int arr[]) {
		
		System.out.println("printing array: ");
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int[] arrange(int n) {
    	//Your code goes here
        int p = 1;
        int arr[] = new int[n];
        if(n%2 != 0) {
        for(int i=0; i<(n/2) + 1; i++){
            arr[i] = p;
            p +=2;
        }
        int k = n-1;
        for(int i=n/2 + 1; i<n; i++){
            arr[i] = k;
            k -= 2;
        }
        return arr;
    }
        else {
        	for(int i=0; i<n/2; i++){
                arr[i] = p;
                p +=2;
            }
            int k = n;
            for(int i=n/2 ; i<n; i++){
                arr[i] = k;
                k -= 2;
            }
            return arr;
        	
        	
        }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = arrange(n);
		printArray(arr);

	}

}
