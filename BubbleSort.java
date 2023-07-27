import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
 int arr[]={-30,4,20,-11,0,7,-8};
  sorting(arr);
    System.out.println(Arrays.toString(arr));
    }
    static void sorting(int arr[]) 
    {
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1] >arr[j]) 
                   {
                     int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swap=true; 
                   }
            }
            if(!swap)
            {
                break;
            }
        }

    }
}
