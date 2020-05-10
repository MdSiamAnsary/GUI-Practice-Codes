
package MainPackage;

/*
    Links:
    https://www.geeksforgeeks.org/inputstreamreader-class-in-java/
    https://www.tutorialspoint.com/java/java_files_io.htm
*/

import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Ansary
 */
public class InputStreamReaderExample {
    
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader cin = new InputStreamReader(System.in);
        
        char c ;
        
        do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'q');
        
    }
    
}

/*
    Input Output:

    vcqwe
    vcq
*/