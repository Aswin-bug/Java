public class StaticVariables
{
    int age;
    static String name;
    static
    {
        StaticVariables s=new StaticVariables();//to access the member variables inside the static block we have to create the object then only we can use it.
        s.age=22;
        name="paul";
        System.out.println(s.age+" "+name);
    }
//    public static void add()//this is same for accessing member variables inside the static method.
//    {
//        StaticVariables s=new StaticVariables();
//        s.age=12;
//    }
    public static void main(String[] args) {
        System.out.println("main method");
    }
}
