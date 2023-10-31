package week2.Day1;

public class toFindPalindromeNum {
	public static void main(String args []) 
	{
		int num = 121, output = 0, remainder;
	    
	    	    int input = num;
	       
	    while (num != 0)
	    {
	      remainder = num % 10;
	      output = output * 10 + remainder;
	      num /= 10;
	    }
	    
	   	    if (input == output)
	   	    {
	      System.out.println(input + " is Palindrome.");
	    }
	    else {
	      System.out.println(output + " is not Palindrome.");
	    }
	}

}
