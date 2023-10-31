package week2.Day1;

public class printEvenNumber {
	public static void main(String args[])
	{
		int maxRange=10;
		System.out.println("List of even prime numbers : from 1 to 10");
		for(int i=1;i<=maxRange;i++)
			if(i%2==0)
			{
				System.out.println(i + "");
			}
	}

}
