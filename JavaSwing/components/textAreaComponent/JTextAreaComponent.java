package com.company.components.textAreaComponent;

import com.company.components.textFieldComponent.JTextFieldWithAction;

import javax.swing.*;

public class JTextAreaComponent extends JFrame {

    JTextAreaComponent(){
        JTextArea textArea  = new JTextArea("Welcome to text area");
        textArea.setBounds(10,30,200,200);

        add(textArea);
        setSize(500,500);
        setLayout(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        new JTextAreaComponent();
    }
}
