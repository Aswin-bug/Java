public class Factors {
    
        public static void main(String[] args) {
            int factors=0,N=36;
    
            for(int a=1;a<=Math.sqrt(N);a++)
            {
                if(N%a==0)
                {
                    factors=a;
                    
                }
                if(a!=N/a)
                {
                    factors=N/a;
                }
            }
            System.out.println(factors);
        }
    }
    
