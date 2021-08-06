package com.company.creatingApplet;

import java.applet.Applet;
import java.awt.*;

/* <applet code="SimpleApplet" width=120 height=100></applet> */
public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Hello world", 20,20 );
    }
}
