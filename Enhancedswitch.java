import java.util.Scanner;

public class Enhancedswitch {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
 System.out.println("enter a number");
        int num=s.nextInt();
        switch (num) {
           case 1,2,3,4,5 -> System.out.println("weekdays"); //it works like a lambda expression and the syntax is more clear.
           case 6,7 -> System.out.println("weekend");
            default -> System.out.println("enter valid number");
        }
}
}