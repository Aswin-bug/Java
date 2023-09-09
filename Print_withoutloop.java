import java.util.stream.IntStream;

import static java.lang.System.*;

public class Print_withoutloop {
    public static void main(String[] args) {
        printnum(100,200);

         //2.Stream
        IntStream.range(20,200).forEach(e-> System.out.println(e));//this is a method not loop
    }
    //printing a range of numbers without loop

    //1.Recursion
    public static void printnum(int start,int end)
    {
        if(start<=end)
        {
           System.out.println(start);
            start++;
            printnum(start,end);//we have to call the method,this is what recursion,calls itself again and again until false.
        }
    }

}
