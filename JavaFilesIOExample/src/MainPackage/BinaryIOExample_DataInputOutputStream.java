
package MainPackage;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ansary
 */
public class BinaryIOExample_DataInputOutputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try 
        {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("./dtFile.dat"));
            DataInputStream input = new DataInputStream(new FileInputStream("./dtFile.dat"));

            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);

            while (true) 
            {
                System.out.println(input.readDouble());
            }
        } 
        catch (EOFException ex) 
        {
            System.out.println("All data read");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

}
