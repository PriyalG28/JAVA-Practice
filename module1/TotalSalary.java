package module1;
import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int allow;
        double hra, da, pf, totalSalary, basic;
        Scanner s = new Scanner(System.in);
        basic = (double) s.nextInt();
        String str = s.next();
        char grd = str.charAt(0);
        System.out.println(grd);
        int grade = grd;
        System.out.println(grade);
        if( 0<=basic && basic<=7500000){
            hra = (basic*(20.0/100));
            da = (double)(basic*(50.0/100));
            pf = (double)(basic*(11.0/100));
            if(grade == 65){
                allow = 1700;
                totalSalary = basic + hra + da + allow - pf;
                System.out.println((totalSalary));
                System.out.println(basic+hra);
                return;
            }
            else if( grade == 66){
                allow = 1500;
                totalSalary = basic + hra + da + allow - pf;
                System.out.println(Math.round(totalSalary));
                return;
            }
//            else{
//                allow = 1300;
//                totalSalary = basic + hra + da + allow - pf;
//                System.out.println(Math.round(totalSalary));
//       
//            }
        }

	}

}
