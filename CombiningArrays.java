import java.util.Arrays;
import java.util.stream.Stream;

public class CombiningArrays
{
    public static void main(String[] args)
    {
        String bat[]={"shreyas","rishab","dhoni","kohli","jadeja"};
        String bowl[]={"bumrah","umesh","shami","bhuvaneshwar","kuldeep"};

     //concating two arrays using stream

        Stream<String> sbat=Arrays.stream(bat);
        Stream<String>sbowl=Arrays.stream(bowl);

        String team[]=Stream.concat(sbat,sbowl).toArray(size->new String[size]);//here we can use other var instead of size and this size determines the size of the total concatenated array then we need to store the values in an array that is[team]

        for(String i:team)
    {
        System.out.println(i);
    }


    }
}
