/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_testcinemaproject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author seif
 * 
 */
public class Movies extends JFrame
{
     private final int numberofmovies=4;
     private final JButton[] buton=new JButton[numberofmovies];
     
    public Movies()
    {
       
        setSize(700,700);
        setTitle("Movie Select");
        this.setLayout(null);
        buton[0]=new JButton("Venom");
        buton[1]=new JButton("Avengers");
        buton[2]=new JButton("Amazing spider man");
        
        this.add(buton[0]);
        this.add(buton[1]);
        this.add(buton[2]);
        
        buton[0].setBounds(50, 500 , 100 , 50 );
        buton[1].setBounds(250, 500 , 100 , 50 );
        buton[2].setBounds(450, 500 , 150 , 50 );


        //ImageIcon Imgg = new ImageIcon("C:\\Users\\seif\\Videos\\Desktop\\OOP Project\\Venom.jpg");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
//    private final int numberofmovies=4;
//    private final JButton[] buton=new JButton[numberofmovies];
//    Container p=getContentPane();
//    
//    public Movies()
//    {
//        
//       //setsize(400,500);
//       p.setBackground(Color.yellow);
//       JPanel addPanel = new JPanel();
//    
//        Dimension ScreenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        //setSize((int) ScreenSize.getWidth(), (int) ScreenSize.getHeight());
//        ImageIcon Img = new ImageIcon("C:\\Users\\seif\\Videos\\Desktop\\OOP Project\\Avengers.jpg");
//        setTitle("Select Movies");
//
//      //setExtendedState(MAXIMIZED_BOTH);
//        setUndecorated(true);
//       p.setLayout(new FlowLayout());
//   
//        buton[0]=new JButton(Img);
//        buton[0].setSize(456, 679);
//        buton[0].setBounds(456, 679, 0, 0);
//         Dimension ScreenSiZe = Toolkit.getDefaultToolkit().getScreenSize();
//        //setSize((int) ScreenSiZe.getWidth(), (int) ScreenSize.getHeight());
//        ImageIcon Imgg = new ImageIcon("C:\\Users\\seif\\Videos\\Desktop\\OOP Project\\Venom.jpg");
//        buton[1]=new JButton(Imgg);
//         // buton[1].setSize(297,424);
//          //buton[1].setBounds(400, 679, 0, 0);
//          
//        Dimension ScreenSiZee = Toolkit.getDefaultToolkit().getScreenSize();
//        //setSize((int) ScreenSiZee.getWidth(), (int) ScreenSize.getHeight());
//        ImageIcon Imggg = new ImageIcon("C:\\Users\\BaNa\\Desktop\\amazing-spider-man-poster-movie.jpg");
//        buton[2]=new JButton(Imggg);
//       // buton[2].setSize(700, 500);
//       //buton[2].setBounds(400, 700, 50, 100);
//        buton[3]=new JButton("Back");
//        buton[0].setPreferredSize(new Dimension(400,800));
//        buton[1].setPreferredSize(new Dimension(600,900));
//        buton[2].setPreferredSize(new Dimension(496,872));
//        buton[3].setLocation(12, 300);
//        buton[3].setPreferredSize(new Dimension(50,450));
//        //buton[3].setPreferredSize(new Dimension(50,1080));
//        //buton[3].setSize(100,100);
//
//        //buton[3].setBounds(0,0,300,50);
//       //p.add(buton[0],BorderLayout.EAST);
//       addPanel.add(buton[0]);
//       this.add(buton[0],BorderLayout.SOUTH);
//       addPanel.add(buton[1]);
//       this.add(buton[1]);
//       addPanel.add(buton[2]);
//       this.add(buton[2]);
//       addPanel.add(buton[3]);
//       this.add(buton[3]);
//      //p.add(buton[1],BorderLayout.WEST);
//      // p.add(buton[2],BorderLayout.CENTER);
//        
//      // p.add(buton[3],BorderLayout.SOUTH);
//      setVisible(true);
//      setDefaultCloseOperation(EXIT_ON_CLOSE);
//      //buton[0].addMouseListener( new Movies.MouseEventer());
//      //buton[1].addMouseListener( new Movies.MouseEventer());
//      //buton[2].addMouseListener( new Movies.MouseEventer());
//      //buton[3].addMouseListener(new Movies.MouseEventer());
// 
//    }
//    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//      private class MouseEventer extends MouseAdapter{
//        
//        public void mouseClicked(MouseEvent x)
//        {
//            Object ButtonPressed=x.getSource();
//          if(ButtonPressed.equals(buton[0])||ButtonPressed.equals(buton[1])||ButtonPressed.equals(buton[2])){
//         
//                setVisible(false);
//               SeatAndDataGUI mm=new SeatAndDataGUI();
//                mm.setVisible(true);
//       
//             
//                
//        }
//          if(ButtonPressed.equals(buton[3]))
//                  {
//                       setVisible(false);
//              LoginGui mmm = null;
//                try {
//                    mmm = new LoginGui();
//                } catch (IOException ex) {
//                    Logger.getLogger(moviesGUI.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                mmm.setVisible(true);
//                      
//                  }
//           
//         }
//     }
    
    
}

