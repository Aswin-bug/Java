import java.util.Arrays;
public class PositionCount {
    public static void main(String[] args) {
        int arr[]={2,5,7,7,7,8,8,8,9,10};
        int ans[]=Finalans(arr,8);
        System.out.println(Arrays.toString(ans));
    }
 static int[] Finalans(int arr[],int target)
    {
        int ans[]={-1,-1};

       boolean findingpositions; 
        int start=positions(arr,target,findingpositions=true);
        int end=positions(arr,target,findingpositions=false); 
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
  static int positions(int arr[],int target,boolean findingpositions)
    {
        int ans=-1;
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
                //potential answer found
                ans=middle;
                if(findingpositions==true) //possible answers
                {
                    end=middle-1;
                }
                else {
                    start=middle+1;
                }
            }

        }
return ans;
    }
}
