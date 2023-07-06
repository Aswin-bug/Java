import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class progs {
    
    public static void main(String ar[])
    {
        List<Integer> nums=Arrays.asList(2,1,5,4,3,7,8,9,6);
                   Stream <Integer> ans=nums.stream()
                                    .filter(n->n%2==0)
                                    .map(n->n*2)
                                    .sorted();

                  ans.forEach(n->System.out.println(n));
    }
}
