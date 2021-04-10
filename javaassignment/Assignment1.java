package javaassignment;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        int attempt = 3;
        String creditCardNo1 = "741852963741";
        int password1 = 1234;

        String creditCardNo2 = "123456789123";
        int password2 = 4321;

        String userCardNo;
        int userPassword;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your card number: ");
        userCardNo = input.nextLine();

        if (userCardNo.equals(creditCardNo1) || userCardNo.equals(creditCardNo2)){
            while (attempt != 0){
                System.out.println("Enter your password: ");
                userPassword  = input.nextInt();

                if (userCardNo.equals(creditCardNo1) && userPassword == password1){
                    System.out.println("Successfully accessed");
                    break;
                }else if(userCardNo.equals(creditCardNo2) && userPassword == password2){
                    System.out.println("Successfully accessed");
                    break;
                }
                else{
                    attempt--;
                    System.out.println("wrong password entered only " + attempt + " left\n");
                }

                if (attempt == 0){
                    System.out.println("Card blocked ..Unblock after 24 hours");
                }
            }
        }else{
            System.out.println("Invalid card number\n");
        }

    }
}
