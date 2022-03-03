import java.util.Scanner;
class Prime
{
	public static void main(String args[]) 
	{
 		int f=0;
		int m=0;
		Scanner c=new Scanner(System.in);
                
		System.out.println("Enter number ");
		int n=c.nextInt();
		
   		m=n/2;
 		 if(n==0||n==1)
		  {  
 		     System.out.println(n+" is not prime number");      
		  }
		else
		{  
	 	   for(int i=2;i<=m;i++)
	 	{
		   if(n%i==0)
			{
				 System.out.println("not a prime ");
				f=1;
				break;
			}
		}
		if(f==0)
			System.out.println(" prime ");

		}
	}
}
