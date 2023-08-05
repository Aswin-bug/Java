import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int start=s.nextInt();
        System.out.println("Enter last number");
        int end=s.nextInt();
        PrimeRange p=new PrimeRange();
        p.answer(start,end);
       

    }

    public  void answer(int start,int end)
    {
     for(int i=start;i<end;i++)
     {
        if(isprime(i))
        {
            System.out.println(i);
        }
     }
    }
    public  boolean isprime(int n)
    {
        boolean flag=true;
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(n%i==0)
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
