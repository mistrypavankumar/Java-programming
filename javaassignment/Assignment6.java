package com.company;

import java.io.BufferedWriter;
import java.io.File;
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


    public void saveGiftRecords(int numberOfGift, String personName) {
        try {

            File myObj = new File("giftRecodes.txt");

            myObj.createNewFile();

                if (myObj.isFile()) {
                    FileWriter file = new FileWriter("giftRecodes.txt", true);
                    BufferedWriter myWriter = new BufferedWriter(file);
                    myWriter.write("Gift give by: " + personName + "\n");

                    if (numberOfGift == 1) {
                        myWriter.write("1. " + this.gift1 + "\n\n");
                        myWriter.close();
                    } else if (numberOfGift == 2) {
                        myWriter.write("1. " + this.gift1 + "\n");
                        myWriter.write("2. " + this.gift2 + "\n\n");
                        myWriter.close();
                    } else if (numberOfGift == 3) {
                        myWriter.write("1. " + this.gift1 + "\n");
                        myWriter.write("2. " + this.gift2 + "\n");
                        myWriter.write("3. " + this.gift3 + "\n\n");
                        myWriter.close();
                    }
                    System.out.println("Successfully wrote to the file.");
                }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void readGifts(){
        try{
            File file = new File("giftRecodes.txt");

            if (file.exists()){
                Scanner myReader = new Scanner(file);

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
            }else{
                System.out.println("Record doesn't exist");
            }
        }catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteRecord(){
        File file = new File("giftRecodes.txt");

        if (file.delete()){
            System.out.println("Deleted the file: " + file.getName());
        }else{
            System.out.println("Failed to delete the records");
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
            System.out.println("1. To send gifts:  ");
            System.out.println("2. To see the gifts:  ");
            System.out.println("3. To delete the record: ");
            System.out.println("4. To exit");

            System.out.println("Enter your option: ");
            int option = input.nextInt();

            if (option == 1){

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

                        new Gift(gift1).saveGiftRecords(numberOfGift, personName);
                    }
                    break;
                    case 2:{
                        Scanner getGift = new Scanner(System.in);
                        System.out.println("Enter your " + numberOfGift + " gift name: ");
                        gift1 = getGift.nextLine();
                        gift2 = getGift.nextLine();

                        new Gift(gift1,gift2).saveGiftRecords(numberOfGift, personName);;
                    }
                    break;
                    case 3:{
                        Scanner getGift = new Scanner(System.in);
                        System.out.println("Enter your " + numberOfGift + " gift name: ");
                        gift1 = getGift.nextLine();
                        gift2 = getGift.nextLine();
                        gift3 = getGift.nextLine();

                        new Gift(gift1,gift2,gift3).saveGiftRecords(numberOfGift, personName);
                    }
                    break;
                    default:
                        System.out.println("Invalid input\n");
                }

            }else if (option == 2){
                System.out.println("\n\n<<<<<<<<< Gift Records >>>>>>>>> \n");
                Gift.readGifts();
                System.out.println("<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>\n\n");
            }else if(option == 3){
                Gift.deleteRecord();
            }else{
                System.out.println("\n\n<<<<<< Thank you for using our service >>>>>>>\n\n");
                isTrue = false;
            }
        }
    }
}
