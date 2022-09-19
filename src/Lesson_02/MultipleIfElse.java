package Lesson_02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
        //<18 |18-25 |>55
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls enter your age : ");
        int clientAge = scanner.nextInt();
// Ham if thuc thi tu tren xuong duoi

        if (clientAge < 18){
            System.out.println(" Not buy drink beer");
            if (clientAge <12){
                System.out.printf("Calling 911...");
            }
        }else if (clientAge >=18 && clientAge<=55){
            System.out.println("Unlimited!");
        }else {
            System.out.println( "Two Both");
        }

    }
}
