package week2.Day1;

public class toPrintFibonacciSeries {
	public static void main(String args[])
	{
		 int n = 8, firstNum= 0, secondNum= 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) 
		    {
		      System.out.print(firstNum + ", ");

		     
		      int nextTerm = firstNum + secondNum;
		      firstNum= secondNum;
		      secondNum = nextTerm;
		    }
	}

}
