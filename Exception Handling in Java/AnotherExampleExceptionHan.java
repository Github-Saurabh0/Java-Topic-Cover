class AnotherExampleExceptionHan
{
public static void main(String [] args)
{
try
{	
System.out.println(5/0);
}
catch(NullPointerException e1)
{

}
finally
{
System.out.println("Z");
}	
System.out.println("A");
String s1 = null;


try
{
System.out.println(s1.length());
}
catch(ArithmeticException a1)
{
}

catch(ArrayIndexOutOfBoundsException e1)
{
}
finally
{
System.out.println("B");
}
System.out.println("C");
}
}