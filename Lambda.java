@FunctionalInterface
interface A
{
 int sum(int n,int m);
}

public class Lambda {
    public static void main(String s[])
    {
      A obj= (a,b) ->a+b;  //here we are defining a method that return values with lambda expression  
      System.out.println(obj.sum(19,33));
    }
}
