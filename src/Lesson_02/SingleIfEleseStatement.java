package Lesson_02;

import com.sun.xml.internal.ws.wsdl.WSDLOperationFinder;

import java.util.Scanner;

public class SingleIfEleseStatement {
    public static void main(String[] args) {
        final int  EXPECTED_TIME = 7;
       // int arrivalTime = 9;
        // Insert Value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter arrival time : ");
        int arrivalTime = scanner.nextInt();


        //Comparision Operator : ==, !=, >, < ,>=,<= Toan tu so sanh
        boolean isHeOnTime = (arrivalTime == EXPECTED_TIME) ;

        // Toan tu 3 ngoi - Ternaty operator
        //boolean isHeOnTime = arrivalTime ==EXPECTED_TIME ? true : false;


        ////

        System.out.println("1. Dat xe ra ");
        System.out.println("2. Chay toi quan");

        if (isHeOnTime){
            System.out.printf("\t--->Let's talk!\n");
        } else
            System.out.printf("\t--->Write a letter!\n");
        System.out.println("3. Dat xe ra ");
        System.out.println("4. Chay toi nha");
    }
}
