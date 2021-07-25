package com.company.components.LabelComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelWithImage extends JFrame {

    JLabelWithImage() {
        JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\pavan\\OneDrive\\Desktop\\img.png"));
        jLabel.setBounds(50,100,300,250);

        add(jLabel);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){

    }

    public static void main(String[] args) {
        new JLabelWithImage();
    }
}
