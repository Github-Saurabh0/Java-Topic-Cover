import java.io.*;

class FileH2
{
public static void main(String [] args) throws IOException
{

File f1 = new File("ChottuH2.txt");
f1.createNewFile();
System.out.println("File Created Successfully "+f1);

String s1 = " Saurabhh By Java";
FileOutputStream fout = new FileOutputStream("ChottuH2.txt", true);


char c1[] = s1.toCharArray();
int i;
for(i=0; i<c1.length; i++)
{
	fout.write(c1[i]);
}
System.out.println(f1.exists());
System.out.println(f1.canWrite());
System.out.println(f1.length());
fout.close();

}

}
