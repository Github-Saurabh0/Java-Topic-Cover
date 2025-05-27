class ExceptionH1
{
public static void main(String [] args)
{
String s1;
s1=null;

try
{
System.out.println(s1.length());
}
catch(NullPointerException n1)
{
System.out.println(n1.getMessage());
}
System.out.println("A");
try
{
System.out.println(5/0);
}
catch(ArithmeticException a1)
{
System.out.println(a1.getMessage());
}
System.out.println("B");
}
}