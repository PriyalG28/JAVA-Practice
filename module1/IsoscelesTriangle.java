package module1;

import java.util.Scanner;

public class IsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =  new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while(i <= n) {
			int spaces = 1;
			while(spaces <= n-i) {
				System.out.print(' ');
				spaces++;}
			int j = 1;
			while(j<=i) {
				System.out.print(j);
				j++;
			}
			int dec = i-1;
			while(dec >= 1) {
				System.out.print(dec);
				dec--;
			}
			System.out.println();
			i++;
		}

	}

}
