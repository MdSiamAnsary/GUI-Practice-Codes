
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class AppClass extends JFrame{
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 170;
    
    private JLabel nameLabel, ssnLabel, addressLabel, phoneLabel;
    private JTextField nameTF, ssnTF, addressTF, phoneTF;
    
    AppClass()
    {
        setTitle("New Customer");
        setSize(WIDTH, HEIGHT);
        
        Container paneOb = getContentPane();
        GridLayout layoutOb = new GridLayout(4,2);
        paneOb.setLayout(layoutOb);
        
        nameLabel = new JLabel("Enter name: ");
        ssnLabel = new JLabel("Enter SSN: ");
        addressLabel = new JLabel("Enter Address: ");
        phoneLabel = new JLabel("Enter Phone: ");
        
        nameTF = new JTextField(30);
        ssnTF = new JTextField(11);
        addressTF = new JTextField(50);
        phoneTF = new JTextField(12);
        
        paneOb.add(nameLabel);
        paneOb.add(nameTF);
        
        paneOb.add(ssnLabel);
        paneOb.add(ssnTF);
        
        paneOb.add(addressLabel);
        paneOb.add(addressTF);
        
        paneOb.add(phoneLabel);
        paneOb.add(phoneTF);
    }
    
    public static void main(String[] args) {
        
        JFrame frameOb = new AppClass();
        frameOb.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frameOb.setVisible(true);
        
    }
    
}
