interface Human
{
    String name="xyz";  //by default each variable is both static and final
    int age=25;
    void speak();
    void sing(); // by default each method is public abstract
}
class Body implements Human  // class<-interface -->implements
{
     public void speak()
     {
        System.out.println("speaking");
     }
     public void sing()
     {
        System.out.println("singing");
     }
}
public class Inter {
    public static void main(String a[])
    {
        Human obj=new Body();
        obj.speak();
        obj.sing();
        System.out.println(obj.name+" "+obj.age);

    }
}
