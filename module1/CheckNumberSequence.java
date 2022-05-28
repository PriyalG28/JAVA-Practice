package module1;
import java.util.Scanner;
public class CheckNumberSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(1<=n && n<=10000000){
            int prev = s.nextInt();
            boolean dec = true;
            int flag = 0;
         
            for(int i = 1; i <= n-1; i++){
                int current  = s.nextInt();
                if( prev == current ){
                    System.out.println(false);
                    flag = 1;
                    break;
                }
                else if(prev < current){
                    prev = current;
                    dec = false;
                }
                else{
                    if(dec == false){
                       System.out.println(false); 
                        flag = 1;
                        break;

                    }
                }
                
                
            }
            if(flag!=1){
                System.out.print(true);
            }
            
        
            
            
        }

	}

}
