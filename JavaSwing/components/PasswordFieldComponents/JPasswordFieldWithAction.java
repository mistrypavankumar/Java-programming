package com.company.components.PasswordFieldComponents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldWithAction extends JFrame implements ActionListener {

    JTextField textField;
    JLabel label1, label2,label3;
    JPasswordField passwordField;
    JButton button;

    JPasswordFieldWithAction(){

        label1 = new JLabel("Username: ");
        label1.setBounds(50,100,100,30);

        textField = new JTextField();
        textField.setBounds(120,100,300,30);

        label2 = new JLabel("Password: ");
        label2.setBounds(50,150,100,30);

        passwordField = new JPasswordField();
        passwordField.setBounds(120,150,300,30);

        button = new JButton("Login");
        button.setBounds(150,200,150,30);
        button.addActionListener(this);

        label3  = new JLabel();
        label3.setBounds(50,250,500,30);


        add(label1);
        add(textField);
        add(label2);
        add(passwordField);
        add(button);
        add(label3);

        setSize(500,400);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e){
        String data = "Username: " + textField.getText();
        data += " Password: " + new String(passwordField.getPassword());

        label3.setText(data);
    }

    public static void main(String[] args) {
        new JPasswordFieldWithAction();
    }
}
