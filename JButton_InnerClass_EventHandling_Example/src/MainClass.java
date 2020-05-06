
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MainClass extends JFrame{
    
    private JLabel label;
    private JTextField textField;
    private JButton buttonOne, buttonTwo;
    
    MainClass()
    {
        
        setSize(600,300);
        
        Container container = getContentPane();
        GridLayout layoutOb = new GridLayout(4, 1);
        container.setLayout(layoutOb);
        
        label = new JLabel("This is a label");
        textField = new JTextField();
        buttonOne = new JButton("First Button");
        buttonTwo = new JButton("Second Button");
        
        buttonOne.addActionListener(new InnerClassExOne());
        buttonTwo.addActionListener(new InnerClassExTwo());
        
        
        container.add(label);
        container.add(textField);
        container.add(buttonOne);
        container.add(buttonTwo);
                
                
        
        
    }
    
    public static void main(String[] args) {
        
       JFrame frameOb = new MainClass();
       frameOb.setDefaultCloseOperation(EXIT_ON_CLOSE);
       frameOb.setVisible(true);
        
    }
    
    private class InnerClassExOne implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            textField.setText("String One");
            
        }
        
    }
    
     private class InnerClassExTwo implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            textField.setText("String two");
            
        }
        
    }
    
}
