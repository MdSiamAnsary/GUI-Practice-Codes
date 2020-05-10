/*
    FileInputStream and FileOutputStream are classes related to Java byte streams 
    that are used to perform input and output of 8-bit bytes.
    
    Links:
        https://stackoverflow.com/questions/4361338/reading-txt-file-from-a-specific-package-java
        https://www.tutorialspoint.com/java/java_files_io.htm
*/
package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Ansary
 */
public class FileInputStreamFileOutputStreamExample {
    
    public static void main(String[] args) throws IOException 
    {
        String fileOneLoc , fileTwoLoc;
        File file1, file2;
        boolean fvar1, fvar2;
        FileInputStream in = null;
        FileOutputStream out= null;
        
        try 
        {
            fileOneLoc = "./TextFileFolder/fileOne.txt";
            fileTwoLoc = "./TextFileFolder/fileTwo.txt";
                    
	    file1 = new File(fileOneLoc);  
            file2 = new File(fileTwoLoc);
             
            fvar1 = file1.createNewFile();
            fvar2 = file2.createNewFile();
            
            /*
	    if (fvar1 && fvar2)          
                System.out.println("Files has been created successfully");
	    else
                System.out.println("Files already present at the specified location");
            */
            
            in = new FileInputStream(file1);
            out = new FileOutputStream(file2);
            
            int c;
            while((c= in.read()) != -1)
                out.write(c);
	     
    	} 
        catch (IOException e) 
        {
            System.out.println("Exception Occurred:");
	}
        finally
        {
            if (in != null) 
                in.close();
            if(out != null)
                out.close();
         
        }
        
       
    }
    
}
