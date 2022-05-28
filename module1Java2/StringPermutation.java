package module1Java2;

public class StringPermutation {
	
	public static boolean isPermutation(String str1, String str2) {
		//Your code goes here
        int n1 = str1.length();
        int n2 = str2.length();
        int n = 256;
        int[] frequencyArr1 = new int[n];
        if(n1 != n2){
            return false;
        }
        else{
            
            for(int i=0; i<n1; i++){
                int d = (int)(str1.charAt(i));
                frequencyArr1[d] += 1;     
            }
            for(int i=0; i<n1; i++){
                int d = (int)(str2.charAt(i));
                frequencyArr1[d] -= 1;     
            }
            for(int i=0; i<n; i++){
                if(frequencyArr1[i] != 0){
                    return false;
                }
            }
            return true;
            
            
            
        }
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "race";
		String str1 = "race";
		boolean ans = isPermutation(str, str1);
		
		System.out.println(ans);
	}

}
