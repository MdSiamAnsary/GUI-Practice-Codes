package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ansary
 */
public class TextIOExample_PrintWriter {
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("./printWriterExampleText.txt");
        
        PrintWriter output = new PrintWriter(file);     
        output.print("John T Smith ");     
        output.println(90); 
        output.print("Eric K Jones ");    
        output.println(85);  
        output.close(); 
    }
    
}
