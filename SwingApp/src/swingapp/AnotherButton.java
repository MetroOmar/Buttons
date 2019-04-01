/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingapp;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener

/**
 *
 * @author oabdulle
 */
public class AnotherButton extends JPanel implements ActionListener {
    private JButton print;
    private JLabel label;
    
    
    public AnotherButton(){
        print = new JButton("print");
       label = new JLabel("Hit this button to print to the console");
       
       setPreferredSize(new Dimension(245, 136));
       setLayout(null);
       
       add(print);
       add(label);
       print.setBounds(50, 20, 100, 30);
       label.setBounds(30, 60, 210, 35);
       
       print.addActionListener(this);
    }
    
      public void buttonClicked(ActionEvent z){
        if(z.getSource()== print){
            System.out.println("Pressed another button");
        }
    }
    
}
