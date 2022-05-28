package module1;
import java.util.Scanner;

public class NumberIsoscelesTriangle {

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
//                int spaces = 1; 
//                while(spaces <= n-i){
//                    System.out.print(' ');
//                    spaces++;
//                }
//                int j = 1;
//                int counter = i;
//                while(j <= i){
//                    System.out.print(counter);
//                    counter++;
//                    j++;
//                }
                int j = 1;
                int counter = i;
                while(j<= i){
                    System.out.print(counter);
                    counter--;
                    j++;
                }
                System.out.println();
				i++;
            }
        }

		
	}

}
