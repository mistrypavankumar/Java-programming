package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalculatorPanel implements ActionListener{
    JButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n0,minus,multiply,division,dot,equal,add;
    JFrame jFrame = new JFrame();
    static JTextField result = new JTextField("0",45);
    static String lastCommand = null;


    double preRes = 0, secVal = 0, res;
    JPanel panel = new JPanel();

    public CalculatorPanel(){

        jFrame.setLayout(new BorderLayout());

        result.setEditable(false);
        result.setSize(300,30);
        jFrame.add(result, BorderLayout.NORTH);

        panel.setLayout(new GridLayout(4,4));

        // row - 1
        setNumberButton(n7,"7");
        setNumberButton(n8,"8");
        setNumberButton(n9,"9");

        division = new JButton("/");
        division.addActionListener(this);
        panel.add(division);

        // row - 2

        setNumberButton(n4,"4");
        setNumberButton(n5,"5");
        setNumberButton(n6,"6");

        multiply = new JButton("*");
        multiply.addActionListener(this);
        panel.add(multiply);

        // row - 3

        setNumberButton(n1,"1");
        setNumberButton(n2,"2");
        setNumberButton(n3,"3");

        minus = new JButton("-");
        minus.addActionListener(this);
        panel.add(minus);

        // row - 4

        dot = new JButton(".");
        dot.addActionListener(this);
        panel.add(dot);

        setNumberButton(n0,"0");

        add = new JButton("+");
        add.addActionListener(this);
        panel.add(add);

        equal = new JButton("=");
        equal.addActionListener(this);
        panel.add(equal);

        jFrame.add(panel, BorderLayout.CENTER);

        jFrame.setSize(300,500);
        jFrame.setVisible(true);

    }

    private void setNumberButton( JButton buttonRef, String buttonName){
        buttonRef = new JButton(buttonName);
        JButton finalButtonRef = buttonRef;
        buttonRef.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == finalButtonRef) assign(buttonName);
            }
        });
        panel.add(buttonRef);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == dot) {
            if (!(result.getText()).contains("."))
                result.setText(result.getText() + ".");
        }
        else if(e.getSource() == minus){
            preRes = Double.parseDouble(result.getText());
            System.out.println(preRes);
            lastCommand = "-";
            result.setText("0");
        }else if(e.getSource() == division){
            preRes = Double.parseDouble(result.getText());
            lastCommand = "/";
            result.setText("0");
        }
        else if(e.getSource() == add){
            preRes = Double.parseDouble(result.getText());
            lastCommand = "+";
            result.setText("0");
        }
        else if(e.getSource() == multiply){
            preRes = Double.parseDouble(result.getText());
            lastCommand = "*";
            result.setText("0");
        }
        else if(e.getSource() == equal){
            secVal = Double.parseDouble(result.getText());

            if (lastCommand.equals("/")){
               if (secVal != 0){
                   res = preRes / secVal;
                   result.setText(String.valueOf(res));
               }else if(preRes == 0){
                   result.setText("0");
               }else{
                   result.setText("0");
                  JOptionPane.showMessageDialog(jFrame, "Cannot divide by zero");
                  lastCommand = "=";
               }
            }else if(lastCommand.equals("*")){
                res = preRes * secVal;
                result.setText(String.valueOf(res));
            }else if(lastCommand.equals("-")){
                res = preRes - secVal;
                result.setText(String.valueOf(res));
            }else if(lastCommand.equals("+")){
                res = preRes + secVal;
                result.setText(String.valueOf(res));
            }else if(e.getSource() == null){
                preRes = Double.parseDouble(result.getText());
                lastCommand = "*";
                result.setText("0");
            }
        }
    }

    private static void assign(String number){
        if ((result.getText()).equals("0")){
            result.setText(number);
        }else if(lastCommand == "="){
            result.setText(number);
            lastCommand = "=";
        }else{
            result.setText(result.getText() + number);
        }
    }
}


public class Calculator{
    public static void main(String[] args) {
        new CalculatorPanel();
    }
}
