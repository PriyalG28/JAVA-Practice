package module1Java2;
import java.util.Scanner;
public class ReturnArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
        if(1 <= t && t <= 100){
            for(int i = 0; i < t ; i++){
                int n = s.nextInt();
                int arr[] = new int[n];
                for(int j = 0; j < n; j++){
                    arr[j] = s.nextInt();                    
                }
                int sum = 0;
                for(int j = 0; j < n; j++){
                    sum += arr[j];
                }
                System.out.println(sum);
            }
        }

	}

}
