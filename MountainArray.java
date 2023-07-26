public class MountainArray {

    public static void main(String[] args) {
        int ar[]={1,3,4,6,5,3,2,1};
        System.out.println(mountain(ar));

    }
    static int mountain(int arr[])
    {
        int start=0;
        int end=arr.length-1;
        while(start<end) 
        {
            int middle=start+(end-start)/2;

            if(arr[middle]>arr[middle+1])
            {
                end=middle; //Descending
            }
            else
            {
                start=middle+1; //Ascending
            }
        }
        return arr[start]; 
    }
}