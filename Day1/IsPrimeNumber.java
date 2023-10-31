package week2.Day1;

public class IsPrimeNumber {
	static void checkPrime(int n){  
		  int i,m=0;
		  int flag=0;      
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is neither prime nor composite number");      
		  }
		  else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not a prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)
		   { System.out.println(n+" is prime number"); }  
		  }//end of else  
	
	
		
	}
	public static void main(String args[]){    
		  checkPrime(1);  
		  checkPrime(3);  
		  checkPrime(99);  
		  checkPrime(42);  
		}    
		}   

