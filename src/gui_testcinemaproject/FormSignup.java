/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_testcinemaproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author seif
 */
public class FormSignup extends JFrame
{
 
    JLabel firstNameLabel = new JLabel("Enter first name");
    JTextField firstName = new JTextField(10);

    JLabel lastNameLabel= new JLabel("Enter last name");
    JTextField lastName= new JTextField(10);

    JLabel usernameLabel = new JLabel("Enter Username");
    JTextField username= new JTextField(10);

    JLabel passwordLabel = new JLabel("Enter a password");
    JTextField password= new JTextField(10);
 
    JLabel emailLabel = new JLabel() ;
    JTextField emailField = new JTextField();

    JLabel phoneNumberLabel =  new JLabel();
    JTextField phoneNumber = new JTextField();
    
    JLabel dateOfBirthLabel = new JLabel("Enter Date of Birth");
    JTextField day= new JTextField(3);
    JTextField month= new JTextField(3);
    JTextField year= new JTextField(6);

    JLabel genderLabel = new JLabel("Gender");
    ButtonGroup genderRadioGroup = new ButtonGroup();
    JRadioButton male= new JRadioButton("Male", true);
    JRadioButton female= new JRadioButton("Female", false);
    
    JButton submit = new JButton("Submit");
    
    public FormSignup()
    {
        setSize(550,600);
        setTitle("Signup Form");
        setLayout(null);

        this.add(firstNameLabel);
        this.add(firstName);
        
        this.add(lastNameLabel);
        this.add(lastName);
        
        this.add(usernameLabel);
        this.add(username);
        
        this.add(passwordLabel);
        this.add(password);
        
        this.add(emailLabel);
        this.add(emailField);
        
        this.add(phoneNumberLabel);
        this.add(phoneNumber);
        
        this.add(dateOfBirthLabel);
        this.add(day);
        this.add(month);
        this.add(year);
        
        this.add(genderLabel);
        this.add(male);
        this.add(female);
        genderRadioGroup.add(male);
        genderRadioGroup.add(female);
        
        this.add(submit);
        
        firstNameLabel.setBounds(50, 50, 300, 30);
        firstName.setBounds(200, 50, 300, 30);
        
        lastNameLabel.setBounds(50, 100, 300, 30);
        lastName.setBounds(200, 100, 300, 30);
        
        usernameLabel.setBounds(50, 150, 300, 30);
        username.setBounds(200, 150, 300, 30);

        passwordLabel.setBounds(50, 200, 300, 30);
        password.setBounds(200, 200, 300, 30);
        
        emailLabel.setBounds(50, 250, 300, 30);
        emailField.setBounds(200, 250, 300, 30);

        phoneNumberLabel.setBounds(50, 300, 300, 30);
        phoneNumber.setBounds(200, 300, 300, 30);
        
        dateOfBirthLabel.setBounds(50, 350, 150, 30);
        day.setBounds(200, 350, 80, 30);
        month.setBounds(320, 350, 80, 30);
        year.setBounds(420, 350, 80, 30);
        
        genderLabel.setBounds(50, 400, 50, 30);
        male.setBounds(200, 400, 100, 30);
        female.setBounds(400, 400, 100, 30);
        
        submit.setBounds(400, 450, 100, 30);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        submit.addActionListener(new FormSignup.SignSubmit());

    }
        private class SignSubmit implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae)
        {
            Object y=ae.getSource();
            if(y.equals(submit))
            {
                Movies m=new Movies();
                m.setVisible(true);
                setVisible(false);
            }
        }
        
    }
}
