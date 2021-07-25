package com.company.components.textFieldComponent;

import javax.swing.*;

/*
    JTextField -  It is a class of text component that allows the editing of a single
                  line text.
                  It inherits JTextComponent class
 */

public class JTextFieldComponent extends JFrame {

    JTextFieldComponent(){

        // Creating object of JTextField
        JTextField textField1,textField2;

        textField1 = new JTextField("TextField Example");
        textField1.setBounds(50,100,200,30);

        textField2 = new JTextField("Welcome to Swing components");
        textField2.setBounds(50,150,200,30);

        add(textField1);
        add(textField2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new JTextFieldComponent();
    }
}
