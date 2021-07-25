package com.company.components.LabelComponents;

// to use JLabel we need to import JLabel class
import javax.swing.*;

/*
   JLabel - It is a component for placing a text in a container.
            It is used to display a single line of read only text.
            It cannot be changed by the user directly.
            It inherits JComponent class.
 */

public class JLabelComponent {

    JLabelComponent() {
        JFrame jFrame = new JFrame();

        // creating objects of JLabel
        JLabel jLabel1, jLabel2;

        // creating JLabel component
        jLabel1 = new JLabel("First Name: ");
        jLabel1.setBounds(50,50,100,30);

        jLabel2 = new JLabel("Last Name: ");
        jLabel2.setBounds(50,100,100,30);

        jFrame.add(jLabel1);
        jFrame.add(jLabel2);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        new JLabelComponent();
    }
}
