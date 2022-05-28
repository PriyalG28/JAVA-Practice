package module1;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        int s, w, e, celsius; 
	        
	        s = sc.nextInt();
	        e = sc.nextInt();
	        w = sc.nextInt();
	        if ( 0<=s && s<=80 && s<=e && e<=900 && 0<=w && w<=40){
	            while(s<=e){
	                celsius = (int)((s-32)/1.8);
	                System.out.println(s+" "+celsius);
	                s = s + w;

	            }
	        }

	}

}
