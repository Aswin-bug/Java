public class Nestedwhile {
    public static void main(String a[])
    {
        int x=1;
        while(x<=5)
        {
            System.out.println("hello "+x);
            x++;  //after this process the inner loop runs always
            int y=1;
            while(y<=3)// the inner loop will stop only if the outer loop fails.
            {
                System.out.println("hi "+y);
                y++;
            }
        }
        System.out.println("bye "+x);//here the value of x will be 6 that's why the condition fails.
    }
    
}
