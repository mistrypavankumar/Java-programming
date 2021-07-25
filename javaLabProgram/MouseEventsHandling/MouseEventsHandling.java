package com.company;

import java.awt.*;
        import java.applet.*;
        import java.awt.event.*;

/*<applet code="MouseDemo" width=300 height=300></applet>*/
public class MouseEventsHandling extends Applet implements MouseListener, MouseMotionListener
{
    int mx = 0;
    int my = 0;
    String msg = "";
    public void init()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
        mx = 20;
        my = 40;
        msg = "Mouse Clicked";
        repaint();
    }
    public void mousePressed(MouseEvent me) {
        mx = 30;
        my = 60;
        msg = "Mouse Pressed";
        repaint();
    }
    public void mouseReleased(MouseEvent me) {
        mx = 30;
        my = 60;
        msg = "Mouse Released";
        repaint();
    }
    public void mouseEntered(MouseEvent me) {
        mx = 40;
        my = 80;
        msg = "Mouse Entered";
        repaint();
    }
    public void mouseExited(MouseEvent me) {
        mx = 40;
        my = 80;
        msg = "Mouse Exited";
        repaint();
    }
    public void mouseDragged(MouseEvent me) {
        mx = me.getX();
        my = me.getY();
        showStatus("Currently mouse dragged" + mx + " " + my);

        repaint();
    }
    public void mouseMoved(MouseEvent me) {
        mx = me.getX();
        my = me.getY();
        showStatus("Currently mouse is at" + mx + " " + my);
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString("Handling Mouse Events", 30, 20);
        g.drawString(msg, 60, 40);
    }
}