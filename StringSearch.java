public class StringSearch {
    public static void main(String[] args) {
        String s = "javalanguage";
        char ch='a';
        System.out.println(Search(s,ch));
    }
        public static boolean Search(String s,char ch)
    {
        if(s.length()==0)
            return false;
        for(char c:s.toCharArray())//here we convert the String to characterArray
        {
            if(c==ch) //checking the current character with the input character
                return true;
        }
        return false;
    }

    }
    

