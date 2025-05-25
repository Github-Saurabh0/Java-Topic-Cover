class nonStatic
{

int x; //instance (Object) member variable
int y; //instance (Object) member variable

void fun1() //instance (Object) member function
{
System.out.println("A");
}
void fun2()
{
System.out.println("B");
}

public static void main(String[] args)
{

nonStatic ns1 = new nonStatic();

ns1.x = 5;  

System.out.println(ns1.y);
System.out.println(ns1.x);

nonStatic ns2 = new nonStatic();

ns2.y = 5;

System.out.println(ns2.y);
System.out.println(ns2.x);

ns1.fun1();
ns1.fun2();
ns1.fun1();
ns2.fun2();


}
}
