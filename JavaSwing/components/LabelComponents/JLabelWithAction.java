package com.company.components.LabelComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JLabelWithAction implements ActionListener{
    JTextArea textArea;
    JLabel jLabel;
    JButton jButton;

    JLabelWithAction() {
        JFrame jFrame = new JFrame();

        textArea = new JTextArea();
        textArea.setBounds(50,50,250,20);

        jLabel = new JLabel();
        jLabel.setBounds(50,100,250,20);

        jButton = new JButton("Click to find IP");
        jButton.setBounds(70,150,200,40);

        // action on button
        jButton.addActionListener(this);

        jFrame.add(textArea);
        jFrame.add(jLabel);
        jFrame.add(jButton);

        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        try {
            String host = textArea.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            jLabel.setText("IP of " + host + " is " + ip);

        }catch (Exception exception){
            System.out.println(exception);
        }
    }


    public static void main(String[] args) {
        new JLabelWithAction();
    }
}
