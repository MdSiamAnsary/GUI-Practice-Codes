
package MainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Ansary
 */
public class BinaryIOExample_FileInputOutputStream {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            FileOutputStream output = new FileOutputStream("./temp.dat");
            FileInputStream input = new FileInputStream("./temp.dat");

            for (int i = 1; i <= 10; i++) {
                output.write(i);
            }

            int value;
            while ((value = input.read()) != -1) {
                System.out.print(value + " ");
            }
        } catch (Exception ex) {

        }

    }

}
