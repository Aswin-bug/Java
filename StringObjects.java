public class StringObjects {

    public static void main(String[] args) {

        /*
        How many String objects will be created after that statement ->2

    After this stmnt the object ref(n1) will be stored in stack area then it will be pointing on the "oldboy"in the heap area then this value will also be stored in String constant pool which is also in heap area.Assume again u are creating another object with the same value "oldboy" this time n2 will be stored at stack and pointing to the "oldboy" in heap but the oldboy won't be stored again in String constant pool.
    if u give normal stmnt like String str="new world"(this stmnt is called String Literals and here we are not creating any object so these values will only be stored in string pool not as previous values that is being stored in heap also) the above process will happen in all the three places.
         */
        String n1=new String("Oldboy"); //here 2 objects will be created one in heap one in string pool

        String s1="new world";
        String s2="new world"; //here 1 object will be created in string pool as "new world" and all the ref are pointing to them.
        String s3=s1;

 //totally three objects are created in this example n1,n2 and(s1,s2,s3).
//        String n1=new String("Oldboy");
//        String n2=new String("oldboy");
//
//        String s1="new world";
//        String s2="new world";
//        String s3=s1;

       // we can confirm  by print this
//        System.out.println(s1==s2);
//        System.out.println(s2==s3);
//        System.out.println(s3==s1);
//
//        System.out.println(n1==n2);
//        System.out.println(s2==n1);
//


    }
}
