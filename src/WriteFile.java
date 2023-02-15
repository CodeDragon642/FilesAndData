import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("Poem.txt", true);

            myWriter.write("A sunset stained pink \n marking an end to the journey \n how fragile a heart.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
