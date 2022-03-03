class MultiCatch{
public static void main(String[] args){
int sum=0;
int s[]=newInt[];
for (int i = 0; i <= args.length; i++)
{ try{
sum=sum+Integer.parseInt(s[i]);
}
catch(NumberFormatException ex1)
{
System.out.println(ex1);
}
catch (ArrayIndexOutOfBoundsException ex2)
{
System.out.println(ex2);
}
}
System.out.println("sum="+sum+"\n");
}
}
