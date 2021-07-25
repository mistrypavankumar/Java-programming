package task;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.util.Scanner;

class Demo extends JFrame{
    Demo(){
        GridLayout gridLayout = new GridLayout(0,3);
        setLayout(gridLayout);

        try{
            FileInputStream fs = new FileInputStream("C:\\Users\\pavan\\IdeaProjects\\javalab\\src\\task\\table");
            Scanner sc = new Scanner(fs).useDelimiter(",");

            String[] arrayList;
            String a;

            while (sc.hasNextLine()){
                a = sc.nextLine();
                arrayList = a.split(",");

                for (String i: arrayList
                     ) {
                    add(new JLabel(i));
                }
            }

        }catch (Exception e){
            System.out.println(e);
        }

        setSize(400,400);
        setVisible(true);
    }
}

public class TableDemo {
    public static void main(String[] args) {
        new Demo();
    }
}
