public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={23,45,6,2,12,76,65,87};
        System.out.println(Search(arr,12));
    }
    static int Search(int arr[],int ans)
    {
        if(arr.length==0)
            return -1;
        for (int value : arr) { //here we use Enhanced for loop to return the founded value.
            if (value == ans)
                return value;
        }
        return -1;
    }
}
