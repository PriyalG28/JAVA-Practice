package module1Java2;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int count = 0;
//        int low = 278382788;
//        int high = 569302584;
//        if(0<=low && high<=1000000000) {
//        	if(low%2 == 0 && high%2 ==0) {
//        		System.out.println((high-low)/2);
//        	}
//        	else {
//        		System.out.println((high-low)/2 + 1);
//        	}
//        }
//        System.out.println(count);
		int salary[] = {1000, 4000, 3000, 2000};
        int min_salary_index = 0;
        int max_salary_index = 0;
        int min_salary = salary[0];
        int max_salary = 0;
        for(int i=0; i<salary.length; i++){
            if(salary[i]<min_salary){
                min_salary = salary[i];
                min_salary_index = i;
            }
            if(salary[i]>max_salary){
                max_salary = salary[i];
                max_salary_index = i;
            }
        }
        int sum = 0;
        for(int i=0; i<salary.length;i++){
            if(i == min_salary_index || i == max_salary_index){
                continue;
            }
            else{
                sum += salary[i];
                
            }
        }
        int count = salary.length - 2;
        System.out.println(sum/count); 
	}

}
