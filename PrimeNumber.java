import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int num=s.nextInt();
       boolean ans= isprime(num);
        System.out.println(ans);

    }
    static boolean isprime(int m)
    {
        boolean flag=true;
        for(int i=2;i<m/2;i++)
        {
            if(m%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
            return true;
        return false;
}
}