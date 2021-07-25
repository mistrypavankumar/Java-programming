package com.company.components.textFieldComponent;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldWithAction extends JFrame implements ActionListener {
    JTextField textField1,textField2,textField3;
    JButton jButton1,jButton2;

    JTextFieldWithAction() {

        textField1 = new JTextField();
        textField1.setBounds(50,50,150,20);

        textField2 = new JTextField();
        textField2.setBounds(50,100,150,20);

        textField3 = new JTextField();
        textField3.setBounds(50,150,150,20);

        // Here we are making text field by default not editable
        textField3.setEditable(false);

        jButton1 = new JButton("+");
        jButton1.setBounds(50,200,50,50);
        jButton1.addActionListener(this);

        jButton2  = new JButton("-");
        jButton2.setBounds(120,200,50,50);
        jButton2.addActionListener(this);

        add(textField1);
        add(textField2);
        add(textField3);
        add(jButton1);
        add(jButton2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String s1 = textField1.getText();
        String s2 = textField2.getText();

        // Converting string into a number
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;

        if (e.getSource() == jButton1){
            c = a + b;
        }else if(e.getSource() == jButton2){
            c = a - b;
        }

        String result = String.valueOf(c);
        textField3.setText(result);

    }

    public static void main(String[] args) {
        new JTextFieldWithAction();
    }
}
