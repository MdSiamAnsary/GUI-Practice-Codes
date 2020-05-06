/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Asus
 */
public class MainClass extends JFrame {
    
    private static final int WIDTH = 500;
    private static final int HEIGHT = 170;

    public MainClass()
    {
        setTitle("New Customer");
        setSize(WIDTH, HEIGHT);
    }
    
    public static void main(String[] args) {
        
        JFrame on = new MainClass();
        on.setDefaultCloseOperation(EXIT_ON_CLOSE);
        on.setVisible(true);
        
    }
    
    
    
}
