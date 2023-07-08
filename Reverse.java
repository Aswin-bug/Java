import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     int num=12345;
     int rem=0,sum=0;
     while(num>0)
     {
        rem=num%10;
        System.out.print(rem);
        num/=10;
     }
    
    }
    
}
