import java.io.File; //import file class
import java.io.IOException; //import io exception

public class FileIO {
    public static void main (String[] args){
        try{ //block of code to try
            File myObj = new File ("Poem.txt");
            if (myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        } catch (IOException e){ //block of code to catch errors
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}
