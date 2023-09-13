import java.util.StringJoiner;

public class StringJoining {
    public static void main(String[] args) {
        StringJoiner join=new StringJoiner(",","[","]");//we can also use space in delimiter and also use space in prefix,suffix.
        join.add("dog")
                .add("cat")
                .add("parrot")
                .add("pigeon");

        System.out.println(join.toString());
    }
}

