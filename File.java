import java.io.FileWriter;
import java.io.IOException;

public class File{

    public static void savefile(String content){
        try{
            FileWriter file = new FileWriter("Notepad.txt");
            file.write(content);
            file.close();
            System.out.println("File has been saved");
        }
        catch(IOException e){
            System.out. println(e.getMessage());
            // System.out. println(e.printStackTrace());
        }
    }
}