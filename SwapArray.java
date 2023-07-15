import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int arr[]={2,7,1,4,3,5,6};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int arr[],int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;

    }
}
