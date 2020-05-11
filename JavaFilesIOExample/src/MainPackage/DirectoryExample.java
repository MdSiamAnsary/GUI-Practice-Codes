
package MainPackage;

import java.io.File;

public class DirectoryExample {
    
    public static void main(String[] args) 
    {
        
        // mkdir example 
        String dirname1 = "./oneDirectory";                     // path
        File file1 = new File(dirname1);                        // file
        file1.mkdir();                                          // make directory
        
        
        // mkdirs example 
        String dirname2 = "./parentDirectory/oneDirectory/twoDirectory";    // path
        File file2 = new File(dirname2);                                    // file
        file2.mkdirs();                                                     // make directory with parent directory
        
        
        File file3 = new File("./parentDirectory");
        String[] paths = file3.list();
        
        for(String path:paths) 
        {
            System.out.println(path);
        }
        
        
    }
}
