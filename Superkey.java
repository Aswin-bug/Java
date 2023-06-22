class A{
 
  public A()  //every super class always belongs to object class.
  {
    
  System.out.println("in a");
  }
  public A(int a)
  {
    
  System.out.println("in int a");
  }

  
}  
class B extends A{
   public B()
  {
    super(4);
  System.out.println("in b");
  }
  public B(int b)
  {
    //super();   //by default every first line of constructor will have super keyword.and it denotes the super class
  System.out.println("in int b");
  }

}
public class Superkey{

    public static void main(String a[])
    {
     B obj=new B(4);
    }

}