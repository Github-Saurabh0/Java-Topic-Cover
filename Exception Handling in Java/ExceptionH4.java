import java.io.*;

class ExceptionH4
{
public static void main(String [] args) throws IOException, ClassNotFoundException
{
 System.out.println("A");
// try
// {
throw new IOException("Printer Not found");
// }
// catch(IOException e1)
// {
// System.out.println(e1.getMessage());
// }	
}
}