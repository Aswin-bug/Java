import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Counting_Char_Word_line
{

    public static void main(String[] args) {

        String path="D:\\DSA\\New Text Document.txt";
        int charCount=0;
        int wordCount=0;
        int lineCount=0;
        BufferedReader reader;
        try
        {
            //don't try to ignore the blank line it needs to be counted.
            reader = new BufferedReader(new FileReader(path));
           String currentline=reader.readLine().trim();//this will read from first line then we need to increase the counter to move to next line.here trim would remove the empty spaces at start and end of a line.u can use this if u wanted.

            while (currentline!=null)//this means read till end of the line
            {
                //this also takes the count of the lines
                lineCount++;

                //word count
                String word[]=currentline.split(" ");//split always return array value,this will take tha values based upon every space
                wordCount=wordCount+word.length;

                //char count
                for(String words:word)//here every word will be added totally like "this" "is" "java" then each length is added to characterCount however we are going to print the total character count not for every line.
                {
                    charCount=charCount+words.length();
                }
                currentline=reader.readLine();//this will help to store the all updated values above and move the control to next point
            }
            System.out.println("Lines count:"+lineCount);
            System.out.println("word count:"+wordCount);
            System.out.println("Character count:"+charCount);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
