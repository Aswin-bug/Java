import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Filenio {
    public static void main(String[] args) {
     
      
      try
      {
          Path location=Paths.get("C:\\Users\\saswi\\Downloads\\File handle\\B.text");
          Path create=Files.createFile(location);
          System.out.println("File is created at given location");
      }
      catch(Exception e)
      {
          System.out.println("Exception is coming..");
          e.printStackTrace();
      }
      
    }
    
}
