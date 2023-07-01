class X
{
   public void pinterestoftheobjclass()  //when both method names are same and very large override will help to identify mistake before compile
   {
      System.out.println("in x class");
   }
}
class Y extends X
{
   @Override  //this is a method level annotations and there are some class level annotations. this is suitable for method overriding.
   public void pinterestoftheobjclass()
   {
      System.out.println("in y class");
   }
}
   

public class Annot  {
   public static void main(String args[]) 
   
   {
       X obj=new Y();
       obj.pinterestoftheobjclass();
   }
}

