class A{

    public void show()
    {
        System.out.println("in method A");
    }
    public int add(int a,int b)
    {
        return a+b;
    }
}
class B extends A{

    public void show()
    {
        System.out.println("in method B");
    }
    public int add(int a,int b)
    {
        return a+b+2;
    }
}


public class Methods
{
    public static void main(String a[])
    {
     B obj=new B();  //This is method overriding.when two classes has same method name and arguments the child class will be called automatically.
     obj.show();
     int ans=obj.add(4, 5);
     System.out.println(ans);
    }
}