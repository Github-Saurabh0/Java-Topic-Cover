class Area
{
static void fun1()
{
System.out.println("D");
}
static void fun2()
{
System.out.println("E");
}
}

class Static

{
static void fun1()
{
System.out.println("A");
}
static void fun2()
{
System.out.println("B");
}


public static void main(String[] args)
{
fun1();
fun2();
System.out.println("C");
Area.fun1();
Area.fun2();

}
}
