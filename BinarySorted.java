public class BinarySorted {
    public static void main(String[] args) {
        int arr[] = {-15, -4, -1, 2, 5, 11, 17, 19, 25, 34, 46};
        System.out.println(BinarySearch(arr, 17));
    }
    static int BinarySearch(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int middle=start+(end-start)/2;

            if(target>arr[middle])
            {
                start=middle+1;
            }
            else if(target<arr[middle])
            {
                end=middle-1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }
}