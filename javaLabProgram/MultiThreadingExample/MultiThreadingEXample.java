package com.company;

import java.util.Random;

class RandomNumberThread extends Thread{
    public void run(){
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int randomInteger = random.nextInt(20);
            System.out.println("Random Integer generated: " + randomInteger);

            // checking weather it is even or odd
            if(randomInteger % 2 == 0){
                // Square Thread
               new SquareThread(randomInteger).start();
            }else {
                // Cube Thread
                new CubeThread(randomInteger).start();
            }

            try{
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                System.out.println(ex);
            }
        }
    }
}


class SquareThread extends Thread{
    int number;

    SquareThread(int randomNumber){
        number = randomNumber;
    }

    public void run(){
        int result = number * number;
        System.out.println("Square of " + number + " is " + result);
    }
}


class CubeThread extends Thread{
    int number;

    CubeThread(int randomNumber){
        number = randomNumber;
    }

    public void run(){
        double result = Math.pow(number,3);
        System.out.println("Cube of " + number + " is " + result);
    }
}


public class MultiThreadingEXample {
    public static void main(String[] args) {
        new RandomNumberThread().start();
    }
}
