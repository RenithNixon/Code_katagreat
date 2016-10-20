import java.util.*;
class Greater
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>0)&&(b>0)&&(c>0))
{
if((a>b)&&(a>c))
{
System.out.println(a+ "is greater");
}
else if((b>a)&&(b>c))
{
System.out.println(b+ "is greater");
}
else
{
System.out.println(c+ "is greater");
}
}
else
{
System.out.println("Enter a valid number");
}
}
} 
