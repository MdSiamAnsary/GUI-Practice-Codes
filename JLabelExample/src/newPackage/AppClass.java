/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newPackage;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Asus
 */
public class AppClass extends JFrame {
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 170;
    
    private JLabel nameLabel, ssnLabel, addressLabel, phoneLabel;
    
    
    AppClass()
    {
        setTitle("New Customer");
        setSize(WIDTH, HEIGHT);
        
        Container paneOb = getContentPane();
        GridLayout layoutOb = new GridLayout(4,1);
        paneOb.setLayout(layoutOb);
        
        nameLabel = new JLabel("Enter name: ");
        ssnLabel = new JLabel("Enter SSN: ");
        addressLabel = new JLabel("Enter Address: ");
        phoneLabel = new JLabel("Enter Phone: ");
        
        paneOb.add(nameLabel);
        paneOb.add(ssnLabel);
        paneOb.add(addressLabel);
        paneOb.add(phoneLabel);
        
        
        
    }
    
    public static void main(String[] args) {
        
        JFrame frameOb = new AppClass();
        frameOb.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frameOb.setVisible(true);
        
    }
    
}
