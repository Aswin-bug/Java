public class MaxSumTwoD {
    public static void main(String[] args) {
        int arr[][]={ {1,5},{7,3},{3,5} };
        int target=0,inbetween;
        for (int[] i : arr)
        {
            inbetween = 0;
            for (int j : i)
            {
                inbetween += j;
            }
            if (inbetween > target)
                target = inbetween;
        }
        System.out.println(target);
    }
}
