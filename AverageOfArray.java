import java.util.Arrays;
import java.util.OptionalDouble;

public class AverageOfArray
{
    public static void main(String[] args)
    {
        //normal loop
        int arr[]={1,5,3,7,6,4,2,8,9,12,15,13};
        int count=0;
        for(int i:arr)
        {
            count+=i;
        }
        System.out.println("sum is: "+count);
        System.out.println("Average is: "+(count/arr.length));

        //java 8 Streams

       OptionalDouble ans= Arrays.stream(arr).average();
        System.out.println(ans.getAsDouble());
    }
}
