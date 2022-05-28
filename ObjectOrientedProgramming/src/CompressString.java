
public class CompressString {

		// TODO Auto-generated method stub
		public static String getCompressedString(String str) {
			// Write your code here.
			int n = str.length();
	        int frequency[] = new int[256];
	        String answer = "";
	        for(int i=0; i<n; i++){
	            int k = (int) str.charAt(i);
	            frequency[k] ++;
	        }
	        if(frequency[str.charAt(0)] > 1) {
	        	
	        	answer += ""+str.charAt(0)+""+frequency[str.charAt(0)];
	        }
	        else {
	        	answer += ""+str.charAt(0);

	        }
	 
	        for(int i=1; i<n; i++){
	            if(str.charAt(i) != str.charAt(i-1)){
                    if(frequency[str.charAt(i)] > 1){
                       answer += ""+str.charAt(i)+"" + frequency[str.charAt(i)]; 
                    }
	                else{
                        answer += ""+str.charAt(i);
                    }
	            }
	            
	        }
	        return answer;
	        
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
//			String str = "ad";
//			String answer = getCompressedString(str);
//			System.out.println(answer);
//			  int[][] arr = { { 1, 2 }, { 3, 4 } ,{5,6}}; 
//			    System.out.println(arr.length + arr[0].length); 
			int arr[][]= {{1, 2, 3, 4},
					{5, 6, 7, 8},
					{9, 10, 11, 12},
					{13, 14, 15, 16}
			};
			int sum_u = 0;
			int sum_l = 0;
			int sum_d = 0;
			int sum_b = 0;
			int sum_r = 0;
			for(int i=0; i<arr.length; i++) {
				sum_b += arr[arr.length - 1][i];
				sum_u += arr[0][i];
				sum_l += arr[i][0];
				sum_r += arr[i][arr.length - 1];
				for(int j=0; j<arr[i].length; j++) {
					if(i == j) {
						sum_d += arr[i][j];
					}
					
					
				}
			}
			int sum_bd = 0;
			int j = arr[0].length - 1;
			for(int i=0; i<arr.length; i++) {
				
					sum_bd += arr[i][j];
					j--;
					
				
			}
		    System.out.print(sum_u +sum_b+sum_d+sum_l+ sum_r+sum_bd);
			
		}



}
