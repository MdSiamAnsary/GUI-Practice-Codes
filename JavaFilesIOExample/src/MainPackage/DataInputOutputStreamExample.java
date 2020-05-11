/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ansary
 */
public class DataInputOutputStreamExample {
    
    // Link : https://www.tutorialspoint.com/java/java_datainputstream.htm
    
    public static void main(String args[])throws IOException 
    {

      // writing string to a file encoded as modified UTF-8
      DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("./datafile.txt"));
      dataOut.writeUTF("hello world");
      dataOut.writeUTF("hello earth");

      // Reading data from the same file
      DataInputStream dataIn = new DataInputStream(new FileInputStream("./datafile.txt"));

      while(dataIn.available()>0) 
      {
         String k = dataIn.readUTF();
         System.out.print(k+"\n");
      }
        
   }
    
}
