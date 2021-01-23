/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_testcinemaproject;

import java.awt.*;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author seif
 */
public class Start extends JFrame
{
    JButton login= new JButton("Login");
    JButton signup= new JButton("Signup");
    JButton admin=new JButton("Admin");
    JLabel loginlabel= new JLabel("Already User");
    JLabel signuplabel = new JLabel("Create an account");
    JPanel all= new JPanel();
    JPanel oldu= new JPanel();
    JPanel newu=new JPanel();
    public Start()
    {
        setSize(390,450);
        setTitle("Cinema Ticketing System Ver 1.0.0");
        this.setLayout(null);
        
        this.add(loginlabel);
        this.add(login);
        
        this.add(signuplabel);
        this.add(signup);
        
        this.add(admin);
        
       loginlabel.setBounds(60,60,100,40);
       login.setBounds(190,60,100,40);
       
       signuplabel.setBounds(60,160,130,40);
       signup.setBounds(190,160,100,40);
       
       admin.setBounds(120,250,100,40);
       
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        login.addActionListener(new Start.select());
        signup.addActionListener(new Start.select());
        admin.addActionListener(new Start.select());
        
    }
    
    private class select implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent ae) 
        {
            Object x = ae.getSource();
            if (x.equals(login))
            {
                FormLogin log = new FormLogin();
                log.setVisible(true);
                setVisible(false);
                
            }
            if(x.equals(signup))
            {
                FormSignup sign = new FormSignup();
                sign.setVisible(true);
                setVisible(false);
            }
            if(x.equals(admin))
            {
                FormAdmin ad=new FormAdmin();
                ad.setVisible(true);
                setVisible(false);
            }
            
        }
        
    }

//       private class MouseEvent extends MouseAdapter
//       {
//           
//       }
       
//       
//       private class choose implements MouseListener 
//       {
//          
//        @Override
//        public void mouseClicked(MouseEvent me) 
//        {
//            Object x =me.getSource();
//           
//            
//            //setExtendedState(MAXIMIZED_BOTH);
//            if(x.equals(login))
//            {
//                FormLogin log= new FormLogin();
//                log.setVisible(true);
//                setVisible(false);
//            }
//            if(x.equals(signup))
//            {
//                setVisible(false);
//                FormSignup sign = new FormSignup();
//                sign.setVisible(true);
//                
//            }
//            
//        }
//
//        @Override
//        public void mousePressed(MouseEvent me) {
//        }
//
//        @Override
//        public void mouseReleased(MouseEvent me) {
//        }
//
//        @Override
//        public void mouseEntered(MouseEvent me) {
//        }
//
//        @Override
//        public void mouseExited(MouseEvent me) {
//        }
//           
//       }

}





  //  oldu.setBackground(new Color(255, 102, 51));
//        GroupLayout jPanel1Layout1 = new GroupLayout(oldu);
//        oldu.setLayout(jPanel1Layout1);
//          jPanel1Layout1.setHorizontalGroup(
//          jPanel1Layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 97, Short.MAX_VALUE));
//          
//         jPanel1Layout1.setVerticalGroup(jPanel1Layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100, Short.MAX_VALUE));
//          
//         
//         
//               javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//        getContentPane().setLayout(layout);
//        layout.setHorizontalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(75, 75, 75)
//                .addComponent(oldu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(237, Short.MAX_VALUE))
//        );
//        layout.setVerticalGroup(
//            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGroup(layout.createSequentialGroup()
//                .addGap(150, 150, 150)
//                .addComponent(oldu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
//                .addContainerGap(150, Short.MAX_VALUE))
//        );