import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        System.out.println( armstrong(num));
    }
    static boolean armstrong(int a)
    {
        int rem,sum=0,temp=a;
        while(a>0)
        {
            rem=a%10;
            a/=10;
            sum=sum+rem*rem*rem;
        }
        return sum == temp;
    }
}
