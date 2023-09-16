class learn
{
    public static void main(String[] args) {
        WithoutMain w=new WithoutMain();
        System.out.println( WithoutMain.number);
    }
}
public class WithoutMain {

   static int number=10;

    static
    {
        System.out.println("static block 1");
    }
    static
    {
        System.out.println("static block 2");
    }
    static
    {
        System.out.println("static block 3");
    }
}