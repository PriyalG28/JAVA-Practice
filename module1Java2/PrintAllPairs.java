package module1Java2;

public class PrintAllPairs {
	public static void allPairs(int[] input) {
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				System.out.println("("+input[i]+","+input[j]+")");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,8,9};
		allPairs(arr);

	}

}
