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
import java.awt.event.ActionListener;

public class Display extends JPanel implements ActionListener{
    private JButton print;
    private JLabel label;
   private JButton print1;
   
    
    
    public Display(){
       
       print = new JButton("print");
       label = new JLabel("Hit this button to print to the console");
       
       
       setPreferredSize(new Dimension(245, 136));
       setLayout(null);
       
       add(print);
       add(label);
       print.setBounds(30, 10, 100, 25);
      label.setBounds(20, 45, 210, 35);
       
       print.addActionListener(this);
       
        print1 = new JButton("button");
      // label1 = new JLabel("Hit this button to print to the console");
       
       
      
       add(print1);
       //add(label1);
       print1.setBounds(140, 10, 100, 25);
      // label1.setBounds(30, 45, 150, 40);
       
       print1.addActionListener(this);
       
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== print){
            System.out.println("Pressed button");
        }
        if(e.getSource()==print1){
            System.out.println("Another button pressed");
        }
    }
}
