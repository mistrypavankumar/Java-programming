package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Gift{
    String gift1, gift2, gift3;

    public Gift(String gift1){
        this.gift1 = gift1;

    }

    public Gift(String gift1, String gift2){
        this(gift1);
        this.gift2 = gift2;

    }

    public Gift(String gift1, String gift2, String gift3){
        this(gift1,gift2);
        this.gift3 = gift3;

    }


    public void display(int numberOfGift, String personName){
        System.out.println("\n\n<<<<<<<< Gift Records >>>>>>>>>");
        System.out.println("Gift give by : " + personName);

        if (numberOfGift == 1){
            System.out.println("1. " + this.gift1);
        }else if (numberOfGift == 2){
            System.out.println("1. " + this.gift1);
            System.out.println("2. " + this.gift2);
        }else if(numberOfGift == 3){
            System.out.println("1. " + this.gift1);
            System.out.println("2. " + this.gift2);
            System.out.println("3. " + this.gift3);
        }
    }

}

public class Assignment6 {
    public static void main(String[] args) {

        String gift1,gift2,gift3;
        boolean isTrue = true;
        String personName;

        while (isTrue){

            Scanner input = new Scanner(System.in);
            System.out.println("<<<<<< Gift Sending Express >>>>>>");
            System.out.println("Do you want to send a gift (y/n): ");
            char isSendGift  = input.next().charAt(0);

            if (isSendGift == 'y' || isSendGift == 'Y'){

                Scanner input1 = new Scanner(System.in);
                System.out.println("Enter your name: ");
                personName = input1.nextLine();

                System.out.println("How many gifts do you want to send (1/2/3): ");
                int numberOfGift = input1.nextInt();

                switch (numberOfGift){
                    case 1: {
                        Scanner getGift = new Scanner(System.in);
                        System.out.println("Enter your " + numberOfGift + " gift name: ");
                        gift1 = getGift.nextLine();

                        new Gift(gift1).display(numberOfGift, personName);
                    }
                    break;
                    case 2:{
                        Scanner getGift = new Scanner(System.in);
                        System.out.println("Enter your " + numberOfGift + " gift name: ");
                        gift1 = getGift.nextLine();
                        gift2 = getGift.nextLine();

                        new Gift(gift1,gift2).display(numberOfGift, personName);;
                    }
                    break;
                    case 3:{
                        Scanner getGift = new Scanner(System.in);
                        System.out.println("Enter your " + numberOfGift + " gift name: ");
                        gift1 = getGift.nextLine();
                        gift2 = getGift.nextLine();
                        gift3 = getGift.nextLine();

                        new Gift(gift1,gift2,gift3).display(numberOfGift, personName);
                    }
                    break;
                    default:
                        System.out.println("Invalid input\n");
                }

            }else{
                System.out.println("\n\n<<<<<< Thank you for using our service >>>>>>>\n\n");
                isTrue = false;
            }
        }
    }
}
