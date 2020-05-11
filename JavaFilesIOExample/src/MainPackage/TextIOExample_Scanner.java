
package MainPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Ansary
 */
public class TextIOExample_Scanner {
    
    public static void main(String[] args) throws FileNotFoundException 
    {
        File file = new File("./printWriterExampleText.txt");
        
        Scanner sc = new Scanner(file);
        
        while(sc.hasNext())
        {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            int s4 = sc.nextInt();
            
            System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);
        }
        
        sc.close();
        
        
    }
    
}
