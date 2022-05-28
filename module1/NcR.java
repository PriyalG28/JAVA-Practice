package module1;
import java.util.Scanner;
public class NcR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int factN = 1, factR = 1, factNR = 1;
		for(int i = 1; i <= n; i++) {
			factN *= i;
		}
		for(int i = 1; i <= r; i++) {
			factR *= i;
		}
		for(int i = 1; i <= n - r; i++) {
			factNR *= i;
		}
		int result = factN / (factR * factNR);
		System.out.println(result);
	}

}
