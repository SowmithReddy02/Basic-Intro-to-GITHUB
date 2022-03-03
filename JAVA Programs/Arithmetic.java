import java.util.Scanner;
class Arithmetic
{ public static void main(String[] args)
{ int a,b,sum,diff,mul, div;
System.out.println("Enter twonumbers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
try{
div=a/b;
System.out.println("division result"+div);
}
catch(Exception e)
{
System.out.println(e);
}
sum=a+b;
System.out.println("sum"+sum);
diff=a-b;
System.out.println("difference"+diff);
mul=a*b;
System.out.println("Product"+mul);
}}