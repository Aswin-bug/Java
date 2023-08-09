import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageFormat {
    public static void main(String[] args) {


        URL url= null;
        try {
           // url = new URL("https://images-na.ssl-images-amazon.com/images/G/01/AmazonExports/Fuji/2020/May/Dashboard/Fuji_Dash_Electronics_1x._SY304_CB432774322_.jpg");
            File file=new File("C:\\Users\\saswi\\Downloads\\File handle\\cat.png");
                BufferedImage img=ImageIO.read(file);
                ImageIO.write(img,"png",new File("C:\\Users\\saswi\\Downloads\\File handle\\cat.png"));
                ImageIO.write(img,"jpeg",new File("C:\\Users\\saswi\\Downloads\\File handle\\cat.jpeg"));
                ImageIO.write(img,"gif",new File("C:\\Users\\saswi\\Downloads\\File handle\\cat.gif"));

            System.out.println("Done..");
            }
         catch (MalformedURLException e)
        {
            throw new RuntimeException(e);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }



    }
}
