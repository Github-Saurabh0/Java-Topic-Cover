class CLA
{
public static void main(String []args)
{
int i, s=0;
for(i=0; i<args.length; i++)
{
s=s+Integer.parseInt(args[i]);
}
System.out.println("Average is "+s /args.length);
}
}
