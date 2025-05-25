class Process1 implements Runnable
{
public void run()
{
int i;
for(i=1; i<=10; i++)
{
System.out.println("Process1 : "+ i);
}
}
}
class Process2 implements Runnable
{
public void run()
{
int i;
for(i=1; i<=10; i++)
{
System.out.println("Process2 : "+ i);
}
}
}
class MultiT
{
public static void main(String []args)
{
Process1 p1 = new Process1();
Process2 p2 = new Process2();
Thread t1 = new Thread(p1);
Thread t2 = new Thread(p2);
t1.start();
t2.start();
}
}










