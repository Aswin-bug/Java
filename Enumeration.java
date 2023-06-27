enum status{
    running,pending,successful,declined;  //these are named constants or objects of the enum class.
}

public class Enumeration {
    

    public static void main(String args[])
    {
        status[] s=status.values();
        for(status ans:s)
        {
            System.out.println(ans+" : "+ans.ordinal());
        }
    }
}
