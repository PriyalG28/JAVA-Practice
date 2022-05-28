package module1Java2;
import java.util.Scanner;
public class BuildingQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the height of the building");
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		int volume_stored = 0;
		
		for(int i=0; i<=n; i++) {
			int bracket = 0;
			
			if(arr[i]>arr[i+1]) {
				bracket = arr[i]-arr[i+1];
				volume_stored += bracket;
				}
		}
		System.out.println(volume_stored);

	}

}
