/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_testcinemaproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author seif
 */
public class FormAdmin extends JFrame
{
    JLabel un= new JLabel("Enter Username");
    JTextField tf= new JTextField(10);
    JLabel ps= new JLabel("Enter Your Password");
    JPasswordField pass=new JPasswordField(10);    
    JButton sub = new JButton("Submit");
    public FormAdmin()
    {
       setSize(400,450);
       setTitle("Admin Frame");    
       this.setLayout(null);
       this.add(un);
       this.add(tf);
       this.add(ps);
       this.add(pass);
       this.add(sub);
       
        un.setBounds(50,60,120,40);
       tf.setBounds(50,100,190,40);
       
       ps.setBounds(50, 190, 120,40);
       pass.setBounds(50, 230, 190, 40);
       
       sub.setBounds(270, 350, 80, 30);
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       sub.addActionListener(new FormAdmin.AdminSubmit());

    }
           private class AdminSubmit implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            Object y=ae.getSource();
            if(y.equals(sub))
            {
                MenuEditAdmin m;
                try 
                {
                m = new MenuEditAdmin();
                m.setVisible(true);
                setVisible(false);
                }
                catch (IOException ex) {}
               
            }
        }
        
    }
}
