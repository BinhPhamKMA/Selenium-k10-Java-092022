package Lesson_03;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoopLearing {
    public static void main(String[] args) {
        boolean isContinuing = true;

        while(isContinuing){
            System.out.println("====Game menu====\n");
            System.out.println("1. Generate a random number");
            System.out.println("0.Exit");

            System.out.printf("please input option:\n");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            if (option ==0){
                System.out.printf("Goodbye!!!\n");
                isContinuing = false;
            } else if ( option == 1) {
                int randomNumber = new SecureRandom().nextInt(1000);
                System.out.printf(" Your Random number is %d \n", randomNumber);

            }else{
                System.out.printf(" Nhập lụi rồi ^^\n1");
            }

        }
    }
}
