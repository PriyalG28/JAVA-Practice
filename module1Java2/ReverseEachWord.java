package module1Java2;

public class ReverseEachWord {
	

	public static void reverseEachWord(String str) {
		//Your code goes here
        int n = str.length();
        String answer = "";
        int first_letter_of_word_index = 0;
        int i=0;
        for( ;i<n; i++){
        	if(str.charAt(i) == ' ') {
        		String output = "";
        		int last_letter_of_word_index = i-1;
        		for(int j=first_letter_of_word_index; j<=last_letter_of_word_index; j++) {
        			output = str.charAt(j) + output;
        		}
        		answer += output + " "; 
        		first_letter_of_word_index = i + 1;

        	}
        }
        
        String output = "";
        int last_letter_of_word_index = i-1;
        for(int j=first_letter_of_word_index; j<=last_letter_of_word_index; j++) {
        	output = str.charAt(j) + output;
        }
        answer += output; 
        first_letter_of_word_index = i + 1;
        System.out.println(answer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hi my name is priyal gupta!!! this is my piece of code";
		reverseEachWord(str);

	}

}
