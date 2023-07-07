import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class practice {

  public static void main(String args[]) throws IOException
  {
  
   InputStreamReader i=new InputStreamReader(System.in);
   BufferedReader b=new BufferedReader(i);

   int result=Integer.parseInt(b.readLine());
   b.close();
   System.out.println(result);
    }
    }
  

