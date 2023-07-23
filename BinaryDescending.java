public class BinaryDescending {
    public static void main(String[] args) {
        int arr[]={53,47,33,27,21,11,5,2,1,-1,-5,-7};
        System.out.println(descending(arr,5));

    }
    static int descending (int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int middle=start+(end-start)/2;

            if(target>arr[middle])
            {
                end=middle-1;
            }
            else if(target<arr[middle])
            {
                start=middle+1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}
