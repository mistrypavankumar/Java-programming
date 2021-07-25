package com.company.components.ButtonComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonWithImage {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        // adding image to button
        JButton jButton = new JButton(new ImageIcon("C:\\Users\\pavan\\OneDrive\\Desktop\\img.png"));
        jButton.setBounds(50,100,200,40);

        jFrame.add(jButton);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
