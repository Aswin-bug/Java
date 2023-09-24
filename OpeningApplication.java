import java.io.IOException;

public class OpeningApplication
{
    public static void main(String[] args) throws IOException, InterruptedException {

       Runtime runapp= Runtime.getRuntime();//runtime is a class and getruntime is a method

        Process pr= runapp.exec("notepad.exe \"D:\\test\\practice\\one.txt\"");
       Thread.sleep(4000);
        pr.destroy();//only Process has these methods.

      //  here we need to use string array because we are passing two arguments because in above method it won't be possible
        String s[]=new String[]{"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe" , "https://www.amazon.com"};
        runapp.exec(s);

        String str[]=new String[]{"C:\\Program Files\\VideoLAN\\VLC\\vlc.exe" , "\"D:\\Movies\\@SonyTamizh - Por Thozhil (2023) Tamil HQ HDRip - 1080p - HE.mkv\""};
        runapp.exec(str);

    }
}
