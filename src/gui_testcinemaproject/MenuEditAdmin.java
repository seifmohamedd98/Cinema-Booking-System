/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_testcinemaproject;

import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author seif
 */
public class MenuEditAdmin extends JFrame
{
//      JLabel FilmLabel = new JLabel("Enter New Film Name");
//      JTextField FilmText = new JTextField(10);
    
      JButton addFilm = new JButton("Add Film");
      JButton removeFilm = new JButton("Remove Film");
      JButton editFilm = new JButton("Edit Film");
      JLabel text= new JLabel("Choose what you want to do");
        
      JFileChooser fc= new JFileChooser();
      
      public MenuEditAdmin() throws IOException
      {
          setTitle("Admin Edit Frame");
          setSize(400,380);
          this.setLayout(null);
          this.add(text);
          this.add(addFilm);
          this.add(removeFilm);
          this.add(editFilm);

          text.setBounds(100, 30 , 170 , 50 );
          addFilm.setBounds(100, 120, 150 , 50);
          removeFilm.setBounds(100, 190, 150 , 50);
          editFilm.setBounds(100,260, 150, 50);
          
          /*
        if(fc.showOpenDialog(this)==JFileChooser.APPROVE_OPTION)
        {
           BufferedImage i = ImageIO.read(fc.getSelectedFile());
           JLabel la=new JLabel();
           la.setIcon(new ImageIcon(i));
           this.getContentPane().add(la);
        }
          */        
          
          setDefaultCloseOperation(EXIT_ON_CLOSE);
          
          
      }
      
    
}
