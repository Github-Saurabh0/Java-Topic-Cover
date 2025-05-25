class Demo
{
int x, y;
Demo( int p, int q)
{
System.out.println("Constructor Called Demo d1 with 2 Getting parameters");
x=p;
y=q;
}
int z;
Demo(int f)
{
System.out.println("Constructor Called Demo d2 with 1 Getting parameters");
z=f;
}

Demo()
{
System.out.println("Constructor Called default by compiler with no parameter Demo d3 ");
}

}

class Construct
{
public static void main(String []args)
{
	Demo d1 = new Demo(5,6);
	System.out.println(d1.x);
	System.out.println(d1.y);
	Demo d2 = new Demo(6);
	System.out.println(d2.z);
	Demo d3 = new Demo();
	System.out.println(d3.x);
	System.out.println(d3.y);
}
}




