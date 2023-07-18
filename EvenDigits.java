public class EvenDigits {
    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};
        System.out.println(finalanswer(nums));
    }
    static int finalanswer(int nums[])
    {
        int count=0;
        for(int i:nums)
        {
            if(even(i))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int num)
    {
        int ans=digitscount(num);
        return ans%2==0;
    }
    static int digitscount(int num)
    {

    return (int) Math.log10(num)+1;
    }


}
