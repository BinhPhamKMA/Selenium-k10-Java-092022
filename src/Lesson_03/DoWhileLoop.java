package Lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomnumber = new SecureRandom().nextInt(10);
        System.out.println("RandomNumber: "+ randomnumber);
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Please input your number: ");
            int userNum = scanner.nextInt();
            if (userNum == randomnumber){
                System.out.printf("Hooray!!!");
                break;
            }
            guessingTime++;

        } while(guessingTime < 3 );
        if(guessingTime ==3){
            System.out.println("Chuc ban may man lan sau");
        }
    }
}
