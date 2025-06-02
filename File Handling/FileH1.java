import java.io.*;

class FileH1
{
public static void main(String [] args) throws IOException
{

File f1 = new File("Chottu.txt");

System.out.println(f1.exists());
System.out.println(f1.canWrite());
System.out.println(f1.length());

// f1.createNewFile();

// System.out.println(f1.exists());
// System.out.println(f1.canWrite());
// System.out.println(f1.length());

}

}