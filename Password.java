import java.util.Arrays;

public class Password
{
    public static void main(String[] args) {
/*
password should always be stored in character array instead of string because string is immutable and all of our previous passwords will be stored in the pool constant in heap in jvm
if the hacker gets the memory dump/heap dump he will get the old values before the garbage collector does it work.at the same time u set ur password with the character array and the jvm crashes the hacker might get the latest password
so it is not 100% safe but comparing to string character array is safe,this is also recommended by oracle.
 */
        String str="password";
        System.out.println("paswword is: "+str);

        char arr[]={'a','s','w','i','n','1','2','3'};

        Arrays.fill(arr,'$');//we can also replace the characters with this fill method.
        System.out.println(Arrays.toString(arr));
    }
}
