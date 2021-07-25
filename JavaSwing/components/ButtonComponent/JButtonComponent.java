package com.company.components.ButtonComponent;

// To use JButton we need to import swing
import javax.swing.*;

/*JButton - It is a class used to create a labeled button that has platform independent
            implementation. The application result in some action when the button is pushed;
            It inherit AbstractButton class.
 */

public class JButtonComponent {
    public static void main(String[] args) {

        // create a frame object
        JFrame jFrame = new JFrame();

        // creating a button object
        JButton jButton = new JButton("Click Me");

        // set the position of the button
        jButton.setBounds(50,100,100,30);

        // adding jButton component into frame
        jFrame.add(jButton);

        // setting the size of the frame
        jFrame.setSize(400,400);

        // setting the layout of the frame
        jFrame.setLayout(null);

        // Making the frame visible
        jFrame.setVisible(true);
    }
}
