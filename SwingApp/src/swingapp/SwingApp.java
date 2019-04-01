/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp;

import javax.swing.JFrame;


public class SwingApp {

 
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Gui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Display());
        frame.pack();
        frame.setVisible(true);
        
        
        //JFrame frame1 = new JFrame("My Gui");
    
    }
    
}
