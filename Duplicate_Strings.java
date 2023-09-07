import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate_Strings
{
    public static void main(String[] args) {

        printDuplicates("Madam");
    }
    
    public static void printDuplicates(String s)
    {
        
        if(s==null) 
        {
            System.out.println("NULL String");
            return;
        }
        if(s.isEmpty())
        {
            System.out.println("Empty String");
        }
        if(s.length()==1)
        {
            System.out.println("Single Character String");
        }

        char words[]=s.toCharArray();

        Map<Character,Integer> mapvalue=new HashMap<>();
        for(Character ch:words)
        {
           if(mapvalue.containsKey(ch))
           {
               mapvalue.put(ch,mapvalue.get(ch)+1);
           }
           else
           {
               mapvalue.put(ch,1); //this will add the number for the character.
           }
        }

        //print the map
        Set<Map.Entry<Character,Integer>> entry=mapvalue.entrySet();

        for(Map.Entry<Character,Integer>e:entry)
        {
            if(e.getValue()>1)
            {
                System.out.println(e.getKey()+" : "+e.getValue());
            }

        }

    }
}
    
