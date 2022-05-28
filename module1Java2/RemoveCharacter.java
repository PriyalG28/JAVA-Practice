package module1Java2;

public class RemoveCharacter {
	

	public static char highestOccuringChar(String str) {
		//Your code goes here
        
        int n = str.length();
        int frequency [] = new int[256];
        for(int i=0; i<n; i++){
            int k = (int) (str.charAt(i));
            frequency[k] += 1;
            
        }
   
        char answer = ' ';
        int maxCount = 0;
        for(int j=0; j<n; j++){
            if(frequency[str.charAt(j)] > maxCount){
                maxCount = frequency[str.charAt(j)];
                answer = str.charAt(j);
            }
        }
        
        return answer;
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "bbbsfhfjkdhdjsjdkwwwwwdwww";
		highestOccuringChar(str);
		
	}

}
