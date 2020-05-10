/*
    Java Character streams are used to perform input and output for 16-bit unicode. 
    Though there are many classes related to character streams but the most frequently used classes are, 
    FileReader and FileWriter. 
    Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream but 
    here the major difference is that 
    FileReader reads two bytes at a time and FileWriter writes two bytes at a time.

    Links:
        https://www.tutorialspoint.com/java/java_files_io.htm
 */
package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ansary
 */
public class FileReaderFileWriterExample {
    
    public static void main(String[] args) throws IOException 
    {
        String fileOneLoc , fileTwoLoc;
        File file1, file2;
        boolean fvar1, fvar2;
        FileReader in = null;
        FileWriter out= null;

        try 
        {
            fileOneLoc = "./TextFileFolder/fileOne.txt";
            fileTwoLoc = "./TextFileFolder/fileThree.txt";
                    
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
            
            in = new FileReader(file1);
            out = new FileWriter(file2);
         
            int c;
            while ((c = in.read()) != -1) 
            {
                out.write(c);
            }
        }finally 
        {
         if (in != null) 
         {
            in.close();
         }
         if (out != null) 
         {
            out.close();
         }
      }
    }
    
}
