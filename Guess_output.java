public class Guess_output
{
    public static void main(String[] args)
    {
        int ans=(byte)+(char)-(int)+(long)-1;
        System.out.println(ans);

        int split=(int)+(long)-1;  //this is second part and the ans is -1 and due to unary operator(+) b/w int and long,the int won't affect the -1,so -1 and - will become 1 and the char 1 will be 1 again unary in byte won't create any change so answer will be 1.
        System.out.println(split);
    }
}
