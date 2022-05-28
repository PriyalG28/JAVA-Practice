package module1;
import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(0 <= n && n <= 50){
            int i = 1;
            while(i <= n){
                int spaces = 1; 
                while(spaces <= n-i){
                    System.out.print(' ');
                    spaces++;
                }
                int j = 1;
                while(j <= i){
                    System.out.print('*');
                    j++;
                }
                int dec = i-1;
                while(dec >= 1){
                    System.out.print('*');
                    dec--;
                }
                System.out.println();
				i++;
            }
        }

		
	}

}
