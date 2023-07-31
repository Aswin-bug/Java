class construct
{
    public construct()
    {
        String msg="i am non-parameterized constructor";
        System.out.println(msg);

    }
    public construct(double a,double b)
    {
        System.out.println("i am parameterized constructor "+a+b);
    }
}

public class Constructors {
    public static void main(String[] args) {
        construct obj=new construct();
        construct obj1=new construct(24.6,65.1);

    }
}
