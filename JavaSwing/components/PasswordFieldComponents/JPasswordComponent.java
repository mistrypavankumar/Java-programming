package com.company.components.PasswordFieldComponents;

import javax.swing.*;

/*
    JPasswordField - It is a class of text component which is specialized for password entry.
                     It allows the editing of a single line of text.
                     It inherits JTextField class.
 */

public class JPasswordComponent extends JFrame {
    JTextField textField;
    JPasswordField passwordField;
    JLabel label1,label2;

    JPasswordComponent(){
        setTitle("Password Field example");

        label1 = new JLabel("Email: ");
        label1.setBounds(50,100,80,30);

        textField = new JTextField();
        textField.setBounds(120,100,300,30);

        label2 = new JLabel("Password: ");
        label2.setBounds(50,150,80,30);

        // create a password field
        passwordField = new JPasswordField();
        passwordField.setBounds(120,150,300,30);


        add(label1);
        add(label2);
        add(textField);
        add(passwordField);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
       new JPasswordComponent();
    }
}
