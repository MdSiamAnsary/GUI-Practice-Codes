
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


public class MainClass extends JFrame {
    
    private static final int Height = 400;
    private static final int Width = 650;
    
    private JLabel firstValueLabel,secondValueLabel,outputValueLabel;
    private JButton addButton,subButton,mulButton,divButton ;
    private JTextField firstValueTF,secondValueTF,outputValueTF;
    
    
    
    MainClass()
    {
        setTitle("Mock Calculator Example");
        setSize(Width, Height);
        
        // Centering to user's screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        Container container = getContentPane();
        GridLayout gridLayoutOb = new GridLayout(5, 2);
        container.setLayout(gridLayoutOb);
        
        
        
        firstValueLabel = new JLabel("First value");
        secondValueLabel = new JLabel("Second value");
        outputValueLabel = new JLabel("Output");
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×");
        divButton = new JButton("÷");
        
        firstValueTF = new JTextField();
        secondValueTF = new JTextField();
        outputValueTF = new JTextField();
        
        container.add(firstValueLabel);
        container.add(firstValueTF);
        
        container.add(secondValueLabel);
        container.add(secondValueTF);
        
        container.add(addButton);   
        container.add(subButton);
        container.add(mulButton);
        container.add(divButton);
        
        container.add(outputValueLabel);
        container.add(outputValueTF);
        
        resizeFont(container);
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        JFrame ob = new MainClass();
        ob.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        ob.setVisible(true);
        
    }
    
    public void resizeFont(Container container)
    {
        https://stackoverflow.com/questions/32550489/changing-font-size-according-to-screen-size
        
        container.addComponentListener(new ComponentListener() 
        {

            @Override
            public void componentResized(ComponentEvent e) 
            {
                int width = container.getWidth();
                int height = container.getHeight();
                addButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                subButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                divButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                mulButton.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                
                firstValueLabel.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                secondValueLabel.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                outputValueLabel.setFont(new Font(Font.DIALOG_INPUT, Font.PLAIN, (width + height) / 30));
                
                container.revalidate();
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentShown(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            
        });
    }
    
   
    
}
