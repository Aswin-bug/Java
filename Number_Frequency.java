import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Number_Frequency
{
    public static void digitCount(long number)//long datatype is prescribed here
    {
        if(String.valueOf(number).length()==1)//what if only one number is in the value ,then no need to got further,so changing the datatype to check its length
        {
            System.out.println(number +"- 1");
            return;
        }
        Map<Long,Integer> mapvalue=new HashMap<>();//long -numbers ,integer-count

        while(number!=0)//run the loop until the number becomes 0
        {
            long lastdigit=number%10;
            if(mapvalue.containsKey(lastdigit))
            {
                mapvalue.put(lastdigit,mapvalue.get(lastdigit)+1);
            }
            else
            {
                mapvalue.put(lastdigit,1);
            }
            number/=10;//removing last digit for every iteration
        }
        Set<Long> answer=mapvalue.keySet();
        for(Long keys:answer)
        {
            System.out.println(keys+" : "+mapvalue.get(keys));//here the (keys) will get the value from the mapvalue.
        }
    }


    public static void main(String[] args) {
        digitCount(5);

    }
}
