import java.util.Arrays;

public class variables {
    public static void main(String[] args) {
        fun(4,89,5,42,67,54);
        mul("java "," language",3,56,88,21,43);
    }
    static void fun(int ...b)
    {
        System.out.println(Arrays.toString(b));
    }
    static void mul(String a,String b,int ...c)
    {
        System.out.println(a+b+Arrays.toString(c));
    }
}
