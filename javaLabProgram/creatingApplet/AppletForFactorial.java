package com.company.creatingApplet;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/* <applet code="AppletForFactorial" width=200 height=400></applet> */
public class AppletForFactorial extends Applet implements ActionListener {
    Label l1,l2;
    TextField t1,t2;
    Button b1;

    public void init(){
        l1 = new Label("Enter any integer: ");
        add(l1);

        t1 = new TextField(5);
        add(t1);

        b1 = new Button("Click to find factorial");
        b1.addActionListener(this);
        add(b1);

        l2 = new Label("Result: ");
        add(l2);

        t2 = new TextField(10);
        add(t2);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == b1){
            int fact = fact(Integer.parseInt(t1.getText()));
            t2.setText(String.valueOf(fact));
        }
    }

    int fact(int f){
        if(f == 0 || f == 1)
            return 1;
        else
            return f * fact(f - 1);
    }
}
