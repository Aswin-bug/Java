public class Missing_numbers
{
    public static void main(String[] args) {
    int arr[]={1,2,5,4,3,6,7,8,9}; //this program can find only one missing number
    int ans=MissingNumbers(arr,10); //here we need to mention the count of total numbers including missing numbers.
        System.out.println(ans);


//finding length of a String without using length method.
//        String str="testing";
//        System.out.println(str.lastIndexOf(""));//here the lastindexof gives the last occurrence of a particular character.so here the empty character is at end only,so it returns total length of a String
    }
    public static int MissingNumbers(int arr[],int total)
    {
        int findingsum=total*(total+1)/2; //this will give the total (count of numbers) like in a series 1,2..5 the sum will be 15 (this is the original sum value with all numbers)
        int actualsum=0;//this contains only the sum value of the array elements.

        for(int i:arr)
        {
            actualsum+=i;
        }
        return findingsum-actualsum;





    }
}
