package com.company.components.ButtonComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonWithActions {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JButton jButton = new JButton("Click to perform action");
        jButton.setBounds(50,100,200,30);

        // to perform action on click
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jButton.setText("You have clicked me 😎");
                jButton.setBackground(Color.GREEN);
                jFrame.setSize(500,500);
            }
        });


        jFrame.add(jButton);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
