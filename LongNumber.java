public class LongNumber {
    public static void main(String[] args)
    {
        //int limit(without l)=2147483647 when using long number without l the int will truncate the first(from last) 4 bits of the digit to keep the result with in the range.
        long withoutl=300*75*80*190*365*500;
        System.out.println(withoutl);
        long withl=300*75*80*190*365*500L;
        System.out.println(withl);
    }
}
