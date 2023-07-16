public class MaxValArray {
    public static void main(String[] args) {
        int arr[]={2,6,11,56,34,21};
        maxval(arr,1,4);
    }
    public static void maxval(int arr[],int start,int end)
    {
        int val=Integer.MIN_VALUE;
        for(int i=start;i<end;i++)
        {
            if(arr[i]>val)
            {
                val=arr[i];
            }
        }
        System.out.println(val);
    }
}
