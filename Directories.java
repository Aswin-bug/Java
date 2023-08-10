import java.io.File;
import java.util.Arrays;

public class Directories {
    public static void main(String[] args) {
        String path = "D:\\";
        File files = new File(path);

        File Dfiles[] = files.listFiles();

        Arrays.sort(Dfiles);

        for (File i : Dfiles) {
            if (i.isFile()) {
                System.out.println("File: "+i.getName()+" "+i.getAbsolutePath());

            }
            else if (i.isDirectory()) {
                System.out.println("Directory: "+i.getName()+" "+i.getAbsolutePath());
            }
            else
            {
                System.out.println("unknown: "+i.getName());
            }

        }
    }
}
