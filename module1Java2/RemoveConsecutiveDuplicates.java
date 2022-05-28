package module1Java2;

public class RemoveConsecutiveDuplicates {
	
	public static void removeConsecutiveDuplicates(String str) {
		//Your code goes here
        String output = "";
        int n = str.length();
        char prev_char = str.charAt(0);
        output += prev_char;
        for(int i=1; i<n; ){
            if(prev_char == str.charAt(i)) {
            	i++;
            }
            else {
            	prev_char = str.charAt(i);
            	
            	output += prev_char;
            }
            
            }
        System.out.println(output);
        
        }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbcccad";
		removeConsecutiveDuplicates(str);
		
	}

}
