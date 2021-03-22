package com.company.inheritance;


// final class which will not be able to inherit by other class
final class NotInherite{
    public void display(){
        System.out.println("It will not inherit");
    }
}

class Subclass{
    protected String userName = "Sony";

}

public class Inherit extends Subclass {
    int num ;

    //Getter  --- will return
    public int getNum(){
        return num;
    }

    // Setter --- will initialize
    public void setNum(int value){
        this.num = value;
        System.out.println("User Name: " + userName);
    }

    public static void main(String[] args){
        System.out.println("Hello");

        Inherit obj = new Inherit();
        obj.setNum(10);
        System.out.println(obj.getNum());

        NotInherite obj1 = new NotInherite();
        obj1.display();
    }
}
