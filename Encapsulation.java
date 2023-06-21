class Person{
    private String name;
    private int age;

    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public void setname(String a)
    {
       name=a;
    }
    public void setage(int b)
    {
        age=b;
    }


}
public class Encapsulation {
    public static void main(String s[])
    {
    Person p=new Person();
    p.setname("xyz");
    p.setage(20);
    System.out.println(p.getname()+ " : "+p.getage());

    }
}
