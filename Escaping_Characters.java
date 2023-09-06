public class Escaping_Characters
{
    public static void main(String[] args)
    {
        /*
        /"hello"/
        "/'Hello'/"
        "Hello"
        I love "java"  and "programming" and "movies"
        'I love "java"  and "programming"  and "movies"'
         */

        System.out.println("\"/hello/\"");
        System.out.println("\"/'Hello'/\"");
        System.out.println("I love \"java\" and \"programming\" and \"movies\"");
        System.out.println("'I love \"java\" and \"programming\" and \"movies\"'");

        System.out.println(path("Aswin"));
    }
      public static String path(String s)
      {
          String input="//input[@id='"+s+"']";
          return input;
      }
}
