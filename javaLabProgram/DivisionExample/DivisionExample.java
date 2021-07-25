package com.company;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="DivisionExample"width=230 height=250></applet>*/

public class DivisionExample extends Applet implements ActionListener
{
    String msg;
    TextField num1, num2, res,rem;
    Label l1, l2, l3,l4;
    Button div;

    public void init() {
       add(new Label("Hello world"));

    }

    public void actionPerformed(ActionEvent ae)
    {
        String arg = ae.getActionCommand();
        int num1 = 0, num2 = 0;
        if (arg.equals("Click")) {
            if (this.num1.getText().isEmpty() && this.num2.getText().isEmpty()) {
                msg = "Enter the valid numbers!";
                repaint();
            } else {
                try {
                    num1 = Integer.parseInt(this.num1.getText());
                    num2 = Integer.parseInt(this.num2.getText());

                    int num3 = num1 / num2;
                    int num4= num1 % num2;

                    res.setText(String.valueOf(num3));
                    rem.setText(String.valueOf(num4));
                    msg = "Operation Succesfull!!!";
                    repaint();
                } catch (NumberFormatException ex) {
                    System.out.println(ex);
                    res.setText("");
                    rem.setText("");
                    msg = "NumberFormatException - Non-numeric";
                    repaint();
                } catch (ArithmeticException e) {
                    System.out.println("Can't be divided by Zero" + e);
                    res.setText("");
                    rem.setText("");
                    msg = "Can't be divided by Zero";
                    repaint();
                }
            }
        }
    }

    public void paint(Graphics g) {
        g.drawString(msg, 30, 70);
    }
}

