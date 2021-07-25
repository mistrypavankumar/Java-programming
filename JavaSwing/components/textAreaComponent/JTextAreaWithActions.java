package com.company.components.textAreaComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextAreaWithActions extends JFrame implements ActionListener {
    JLabel jLabel1,jLabel2;
    JButton jButton;
    JTextArea textArea;

    JTextAreaWithActions(){
        jLabel1 = new JLabel();
        jLabel1.setBounds(50,25,100,30);

        jLabel2 = new JLabel();
        jLabel2.setBounds(160,25,100,30);

        // Created a text area
        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setBounds(20,75,250,250);

        jButton = new JButton("Count Words");
        jButton.setBounds(100,350,120,30);

        // action on button
        jButton.addActionListener(this);

        add(jLabel1);
        add(jLabel2);
        add(jButton);
        add(textArea);
        setSize(500,500);
        setLayout(null);
        setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String words[] = text.split("\\s");

        jLabel1.setText("Words: " + words.length);
        jLabel2.setText("Characters: " + text.length());

    }

    public static void main(String[] args) {
        new JTextAreaWithActions();
    }
}
