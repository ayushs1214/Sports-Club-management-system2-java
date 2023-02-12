package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

public class page2ss implements ActionListener
{
    JFrame f2;
    JButton b1,b2,b3,b4;
    page2ss() {
        f2 = new JFrame("Menu");
        b1 = new JButton("Ground Booking");
        b1.setFont(new java.awt.Font("Arial Black", 1, 20));
        b1.setBounds(50, 50, 240, 50);
        b1.addActionListener(this);
        f2.add(b1);


        b2 = new JButton("Membership");
        b2.setFont(new java.awt.Font("Arial Black", 1, 20));
        b2.setBounds(450, 150, 240, 50);
        b2.addActionListener(this);
        f2.add(b2);

        b3 = new JButton("Issuing Of Equipments");
        b3.setFont(new java.awt.Font("Arial Black", 1, 20));
        b3.setBounds(50, 250, 350, 50);
        b3.addActionListener(this);
        f2.add(b3);

        b4 = new JButton("About The Club");
        b4.setFont(new java.awt.Font("Arial Black", 1, 20));
        b4.setBounds(450, 350, 240, 50);
        b4.addActionListener(this);
        f2.add(b4);


        f2.setBounds(380,0,800, 800);
        //f.setBackground(Color.);
        f2.setLayout(null);

        f2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            f2.setVisible(false);
            new bookingss();
        }
        else if(e.getSource()== b2)
        {
            f2.setVisible(false);
            new memberss();
        }
        else if(e.getSource()== b3)
        {
            f2.setVisible(false);
            new sportsss();
        }
        else
        {
            f2.setVisible(false);
            new aboutss();
        }
    }



    public static void main(String[] args) {

        page2ss m1 = new page2ss();
    }
}
