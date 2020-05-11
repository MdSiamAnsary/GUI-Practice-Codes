/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Ansary
 */
public class InputStreamExample {
    
    public static void main(String[] args) throws IOException {
        String fileOneLoc , fileTwoLoc;
        File file1, file2;
        boolean fvar1, fvar2;
        InputStream is = null;
        OutputStream os= null;
        
        try 
        {
            fileOneLoc = "./TextFileFolder/fileFive.txt";
           
	    file1 = new File(fileOneLoc);  
           
            
            byte bWrite [] = {11,21,3,40,5};
            os = new FileOutputStream(file1);
            for(int x = 0; x < bWrite.length ; x++) 
            {
                os.write( bWrite[x] );   // writes the bytes
            }
            
     
            is = new FileInputStream(file1);
            int size = is.available();

            for(int i = 0; i < size; i++) 
            {
                System.out.print(String.valueOf(is.read()) + "  ");
            }
	     
            for(int i = 0; i < size; i++) 
            {
                System.out.print((char)is.read() + "  ");
            }
    	} 
        catch (IOException e) 
        {
            System.out.println("Exception Occurred:");
	}
        finally
        {
            
            if (is != null) 
                is.close();
            if(os != null)
                os.close();
         
        }
        
    }
    
	
}
