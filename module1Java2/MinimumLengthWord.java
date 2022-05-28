package module1Java2;

public class MinimumLengthWord {
	public static String minLengthWord(String input){
		
		// Write your code here
		int n = input.length();

        int min_count = Integer.MAX_VALUE;
        String output = "";
        for(int i=0; i<n; i++){
        	output = "";
            if(input.charAt(i) != ' '){
                output += input.charAt(i);
            }
            else{
                int output_length = output.length();
                if(output_length<min_count){
                    min_count = output_length;
                }
                
                
            }
            
        }
        return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hi there ashi nice meeting you";
		String output = minLengthWord(s);
		System.out.println(output);
	}

}
