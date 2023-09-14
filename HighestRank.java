import java.util.ArrayList;
import java.util.List;

class Students
{
    private final String name;
    private final int rollno;
    private final int age;
    private final int mark;
    public Students(String name, int rollno, int age, int mark) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public int getAge() {
        return age;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Students {" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}


public class HighestRank
{
    public static void main(String[] args) {

        Students s1=new Students("Tom",12,15,80);
        Students s2=new Students("glen",11,15,85);
        Students s3=new Students("stacy",14,15,90);
        Students s4=new Students("peter",15,15,98);

        List<Students> answer=new ArrayList<>();//here we need to pass the generics as students(class name),not as string or integer
        answer.add(s1);
        answer.add(s2);
        answer.add(s3);
        answer.add(s4);

        answer.stream().forEach(e-> System.out.println(e));//stream also works only if u override the toString method.


        //finding students who got more than 80 marks
        answer.stream().filter(e->e.getMark()>80).forEach(e-> System.out.println(e.getName()+" : "+e.getMark()));

        int highmark=answer.stream().map(e->e.getMark()).max(Integer::compare).get();//here  to access that we have to use mapthe get will give integer value .here max will give maximum value so we can use map here because we don't need any condition we just want to print the highest value.
        System.out.println("highestmark :"+highmark);

        //all details of topper
       answer.stream().filter(e->e.getMark()==highmark).forEach(e-> System.out.println(e));//here the first word 'answer' has all the values and when the condition meets (getmark==highmark)it will fetch the all details of the students who scored high marks.


    }
}
