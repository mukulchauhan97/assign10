import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class copy
{
public static void main(String[] args)throws IOException
{
FileInputStream in=null;
FileOutputStream out=null;
try
{
in=new FileInputStream("abc.txt");
out=new FileOutputStream("xyz.txt");
int c;
while((c=in.read())!=-1)
{
out.write(c);
}
}
finally
{if(in!=null){
in.close();
}
if(out!=null){
out.close();
}
}
in=new FileInputStream("xyz.txt");
int c;
while((c=in.read())!=-1)
{
System.out.print((char)c);
}
}
}
