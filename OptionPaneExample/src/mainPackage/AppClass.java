/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/**
 *
 * @author Ansary
 */
public class AppClass {
    
    public static void main(String[] args) {
        
        //JFrame frameOb = new JFrame();
        //frameOb.setSize(600, 500);
        //frameOb.setVisible(true);    
        //frameOb.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        String sName = JOptionPane.showInputDialog("Enter name");
        JOptionPane.showMessageDialog(null, sName);
        //JOptionPane.showMessageDialog(frameOb, sName);
        //frameOb.setVisible(true);  
    }
    
}
