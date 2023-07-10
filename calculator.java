import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int result=0;
    while(true)
    {
        System.out.println("enter the operator");
       char ch=s.next().trim().charAt(0);
       if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
       {
        System.out.println("Enter two numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();

        if(ch=='+')
        result=n1+n2;

        if(ch=='-')
        result=n1-n2;

        if(ch=='*')
        result=n1*n2;

        if(ch=='/')
        {
            if(n2!=0)
            {
                 result=n1/n2;
            }
        }
        if(ch=='%')
        result=n1%n2;
     }
       else if(ch=='x'||ch=='X')
       {
         break;
       }
       else
       {
        System.out.println("Invalid operator");
       }
      System.out.println(result);

    }
    }
    
    
}
