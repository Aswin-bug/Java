class students{
    int rollno;
    String name;
    int mark;
}

public class obj {
    public static void main(String a[])
    {
    students s1=new students();
    s1.name="Aswin";
    s1.rollno=3;
    s1.mark=50;
     students s2=new students();
    s2.name="peter";
    s2.rollno=5;
    s2.mark=70;
     students s3=new students();
    s3.name="lois";
    s3.rollno=8;
    s3.mark=80;
   students student[]=new students[3];
   student[0]=s1;
   student[1]=s2;
   student[2]=s3;
   for(students i:student)
   {
    System.err.println(i.name+":"+i.rollno+" :"+i.mark);
   }

    }
}