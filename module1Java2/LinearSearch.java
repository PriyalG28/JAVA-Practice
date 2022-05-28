package module1Java2;

import java.util.Scanner;


public class LinearSearch {
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("Enter element for "+i+"th position: ");
			arr[i] = s.nextInt();
		}
		return arr;
	}
    public static int linearSearch(int arr[], int x) {
		//Your code goes here
        int flag = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                flag = i;
            }
        }
        if(flag != Integer.MIN_VALUE){
            return flag;
        }
        else
            return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int num = linearSearch(arr, x);
		System.out.println(num);
		

	}

}
