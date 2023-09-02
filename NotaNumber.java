public class NotaNumber {
    public static void main(String[] args) {
        System.out.println(2/0.0);
        System.out.println(0/0.0);
        System.out.println(Math.sqrt(-1));
//generally we can't compare two NAN in any format because there are undefined,so there is nothing to compare if there is no defined number.
// in C language only NaN is not mentioned it will generate some random values otherwise js,c++,ruby will give NaN
        System.out.println(Float.NaN==Float.NaN);
        System.out.println(Float.NaN!=Float.NaN);
    }
}

