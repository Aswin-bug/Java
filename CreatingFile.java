import java.io.FileOutputStream;
import java.util.Scanner;

public class CreatingFile {

    public static void main(String[] args) {
        try {
                       Scanner sc = new Scanner(System.in);
                       System.out.println("Enter the file location path");
                       String location = sc.nextLine();
            
                       FileOutputStream file = new FileOutputStream(location, true);
                       System.out.println("Enter the content");
                       String content=sc.nextLine();
                       byte b[]=content.getBytes();
            
                       file.write(b);
                       file.close();
                       System.out.println("File is created on given location");
                   }
                   catch(Exception e)
                   {
                       System.out.println("Exception is coming");
                       e.printStackTrace();
                   }
            
    }
    
}
