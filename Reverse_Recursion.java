public class Reverse_Recursion
{
    public static void reverse(long num)//recursion
    {
        if(num<10)//last(first)will be printed here.
        {
            System.out.println(num);
            return;
        }
        else
        {
            System.out.print(num%10);//first check the above condition then print the last number
           reverse(num/10);//then last number will be removed,again moves to if condition
        }
    }    public static void main(String[] args) {
        reverse(1234);
    reverse(100);
    reverse(1234567789876l);
    reverse(10101);
    reverse(1001234);



    }
}
