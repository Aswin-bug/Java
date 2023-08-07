import java.io.IOException;
import java.io.InputStreamReader;
class File
{
public static void main(String args[])
{
try(InputStreamReader i=new InputStreamReader (System.in))
{
System.out.println("Enter some letters ");
int letters=i.read();
while(i.ready())
{
System.out.println((char) letters);
letters=i.read();
}

System.out.println();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}