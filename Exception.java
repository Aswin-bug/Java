class AswinException extends RuntimeException{

    public AswinException(String s)
    {
     super(s);
    }
}
public class Exception {
    public static void main(String args[])
    {
        int a=20;
        int b=0;
       try{
        b=a/200;
        if(b==0)
        throw new AswinException("own exception");
       }
       catch(AswinException e)
       {
          b=a/1;
         System.out.println("catch block " +b+" "+e);
       }
       catch(RuntimeException e)
       {
        System.out.println("bye");
       }
    }
}
