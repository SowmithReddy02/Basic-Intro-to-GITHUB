import java.util.Scanner;
class VoterTest {
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
try
{
System.out.println("Enter age of the votee");

int a=s.nextInt();

if(a < 18)
throw new ArithmeticException("NOT ELIGIBLE FOR VOTE");
else
System.out.println("ELIGIBLE FOR VOTE");
}
catch (ArithmeticException e) 
{
e.printStackTrace();
} }}