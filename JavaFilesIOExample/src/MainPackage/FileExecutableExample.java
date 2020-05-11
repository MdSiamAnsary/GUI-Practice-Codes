package MainPackage;

import java.io.File;
import java.io.IOException;

public class FileExecutableExample {
    
    public static void main(String[] args) throws IOException 
    {
        File file = new File("./TextFile.txt");
        file.createNewFile();
        
        file.setExecutable(false);
        System.out.println(file+ " " + file.canExecute()); // makes no sense
        
        file.setExecutable(true);
        System.out.println(file+ " " + file.canExecute()); // makes no sense
        
        file.setExecutable(false);
        System.out.println(file+ " " + file.canExecute()); // makes no sense
        
        
        //Link: https://stackoverflow.com/questions/23146715/java-file-canexecute-always-return-false-on-red-hat-6-5
        
    }
    
}
