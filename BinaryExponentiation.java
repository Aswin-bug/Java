import java.util.Scanner;

public class BinaryExponentiation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long result = 1;
        System.out.println("Enter the base");
        int a = s.nextInt();
        System.out.println("Enter the power");
        int b = s.nextInt();
        while (b > 0)
        {
            if (b % 2 == 1)
                result *= a;
            a = a * a;
            b = b / 2;
        }
        System.out.println(result);
    }
}