import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compare {
    
    public static void main(String ar[])
    {
         Comparator <Integer> ans=new Comparator<Integer>() 
    {
        public int compare(Integer a,Integer b)
        {
            if(a%10 > b%10)
            return 1;
            else
            return -1;
        }
    };
        List <Integer> num=new ArrayList<Integer>();
        num.add(22);
        num.add(57);
        num.add(24);
        num.add(46);

        Collections.sort(num,ans);
        System.out.println(num);
        
    }
}
