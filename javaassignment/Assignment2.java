package javaassignment;

import java.util.Scanner;

public class Assignment2 {

    static void getFoodItems(int itemNo,String itemName,String noOfTabs,  int price, String location){
        System.out.println(itemNo + "\t\t" + itemName  + noOfTabs + "Rs." + price + "\t\t" + location + "\n");
    }

    static void formatOfData(){
        System.out.println("I.No: " +"\t" +"Item Name"+ "\t\t\t" + "Price" + "\t\t\t" + "Location");
        System.out.println("===============================================================");
    }

    public static void main(String[] args) {

        boolean isTrue = true;
        while(isTrue){
            System.out.println("\n\nSelect the Restaurant of your choice for ordering: ");
            System.out.println("Enter 1 - Barbeque\nEnter 2 - Paradise\nEnter 3 - Mcdonald\nEnter 4 - Balaji Santosh Dhaba\nEnter 5 - Exit");

            int userChoice;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your choice: ");
            userChoice = input.nextInt();

            switch (userChoice){
                case 1: {
                    formatOfData();
                    getFoodItems(1,"Veg-Biryani","\t\t\t", 250, "Hyderabad - Banjara Hills");
                    getFoodItems(2,"Chicken-Biryani","\t\t" ,450, "Hyderabad - Banjara Hills");
                    getFoodItems(3,"Chicken 65", "\t\t\t",120, "Hyderabad - Banjara Hills");
                    getFoodItems(4,"Chili chicken","\t\t", 150, "Hyderabad - Banjara Hills");
                }
                break;
                case 2: {
                    formatOfData();
                    getFoodItems(1,"Veg-Biryani", "\t\t\t",299, "Hyderabad - Himayat Nagar");
                    getFoodItems(2,"Chicken-Biryani","\t\t" ,499, "Hyderabad - Himayat Nagar");
                    getFoodItems(3,"Chicken 65","\t\t\t" ,140, "Hyderabad - Himayat Nagar");
                    getFoodItems(4,"Chili chicken","\t\t",160, "Hyderabad - Himayat Nagar");
                    getFoodItems(5,"Chicken Lollipop","\t",200, "Hyderabad - Himayat Nagar");
                }
                break;
                case 3: {
                    formatOfData();
                    getFoodItems(1,"Veg-Biryani","\t\t\t",350, "Hyderabad - Appaji Complex");
                    getFoodItems(2,"Chicken-Biryani","\t\t" ,499, "Hyderabad - Appaji Complex");
                    getFoodItems(3,"Chicken 65", "\t\t\t",130, "Hyderabad - Appaji Complex");
                }
                break;
                case 4: {
                    formatOfData();
                    getFoodItems(1,"Veg-Biryani","\t\t\t" ,250, "Hyderabad - Vanasthalipuram");
                    getFoodItems(2,"Chicken-Biryani", "\t\t",450, "Hyderabad - Vanasthalipuram");
                    getFoodItems(3,"Chicken 65","\t\t\t",120, "Hyderabad - Vanasthalipuram");
                }
                break;
                case 5:{
                    isTrue = false;
                }
                break;
                default:
                    System.out.println("Invalid option....!!\n");

            }
        }

    }
}
