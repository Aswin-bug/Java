class test
{
    public static void main(String[] args) {
        //PrivateConstructor p1=new PrivateConstructor();//then if u trying access the object of a private constructor of another class from another class it won't be possible without static method or static block.
        int result= PrivateConstructor.createObject();
        System.out.println(result);
    }
}
public class PrivateConstructor
{

    int age;
    private PrivateConstructor() //if we make our constructor as private we can create object with in that class only because the private is accessible only with in that class
    {
        age=20;
    }
    public static int createObject()//this static method will pass the value to the above class.
    {
        PrivateConstructor p=new PrivateConstructor();
        return p.age=20;
    }
    public static void main(String[] args) {

    }
}
