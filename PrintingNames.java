public class PrintingNames
{
    public static void main(String[] args) {

        String name="Aswin";
        String s="i";
        /*
        first the 'i' will be replaced by 10 'i' then each 'i' is replaced by 10 'i' then each 10 'i' is replaced by 10.so 10*10*10=1000 and we need to store that in same variable to see the changes,otherwise we won't get the output
         */
        s=s.replaceAll("i","iiiiiiiiii");//10
        s=s.replaceAll("i","iiiiiiiiii");//10*10=100
        s=s.replaceAll("i","iiiiiiiiii");//100*10=1000

        s=s.replaceAll("i",name+"\n");//newline
        System.out.println(s);
    }
}
