public class SubString
{
//1:
    public static boolean Substring(String main,String sub)
{
    return main.matches("(.*)"+sub+"(.*)");//these stars define the string could start and end with anything but check whether it contains the substring.
}
//2:
    public static boolean Substring1(String main,String sub) {
        return main.contains(sub);
    }
    //3:
    public static boolean Substring2(String main,String sub) {
        return main.indexOf(sub)!=-1;
    }
    public static void main(String[] args)
    {
        System.out.println(Substring("java program","g"));
        System.out.println(Substring("java program","rog"));
        System.out.println(Substring1("java ","g"));
        System.out.println(Substring1("java program","language"));
        System.out.println(Substring2("","l"));

    }
}
