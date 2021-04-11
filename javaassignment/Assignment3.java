import java.util.Scanner;

public class IplTeams {

    public static void main(String[] args) {

    	System.out.println("Welcome to IPL SQUAD list 2021: ");

    	System.out.println("Select your Favourite team and view their complete SQUAD! ");
    
    	System.out.println("\n1- Sun Risers Hyderabad"
    			+ "\n2- Mumbai Indians"
    			+ "\n3- Chennai Super Kings"
    			+ "\n4- Royal Challengers Bangalore"
    			+ "\n5- Rajasthan Royals"
    			+ "\n6- Kolkata Knight Riders"
    			+ "\n7- Punjab Kings"
    			+ "\n8- Delhi Capitals");

    	
    	String[] Srh = new String[] {"David Warner (R) Batsman", 
    			"Manish Pandey (R) Batsman",
    			"Kane Williamson (R) Batsman", 
    			"Jonny Bairstow (R) Wicket Keeper", 
    			"Vijay Shankar (R) All-Rounder", 
    			"Mohammad Nabi (R) All-Rounder", 
    			"Jason Holder (R) All-Rounder", 
    			"Rashid Khan (R) Bowler", 
    			"T Natarajan (R) Bowler", 
    			"Khaleel Ahmed (R) Bowler", 
    			"Mujeeb ur Rahman Bowler"};
    	
    	int userChoice;
        Scanner input = new Scanner(System.in);

    	
        System.out.println("Enter your choice: ");
        userChoice = input.nextInt();

        switch (userChoice){
            case 1: {
            	System.out.println("Sun Risers Complete SQUAD for IPL 2021: ");
                for(int i=0; i<11; i++) {
                	System.out.println(Srh[i]);
                }
            	
            }
            break;
            //We need to add more team squad and print them in switch case
            case 2: {
            }
            break;
            case 3: {
              

            }
            break;
            case 4: {

            }
            break;
            case 5:{
            }
            break;
            default:
                System.out.println("Invalid option....!!\n");

        }

    }
}
