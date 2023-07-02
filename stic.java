class phone
{
    static String type; // static will be shared by all the objects as a common value.
    String name;
    int price;
    public void print()
    {
        System.out.println(type+ ":"+name+":"+price); //static value can be passed like this in non static method.
    }
}
public class stic {
    public static void main(String a[])
    {
    
    phone p1=new phone();
    phone.type="smartphone"; // always call the static variable with the CLASS name.
    p1.name="samsung";
    p1.price=12000;

    phone p2=new phone();
    phone.type="smartphone";
    p2.name="iphone";
    p2.price=72000;

    p2.type="touch"; // now touch will be applied to all the objects.

    p1.print();
    p2.print();

    }
    
}