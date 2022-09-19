package Lesson_02;

import java.util.Scanner;

public class Lab02_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen :");
        int so = scanner.nextInt();
        int sodu = so%2;
        //Cach 1
        System.out.printf("So du la : %d \n",sodu  );
        if (sodu ==0){
            System.out.println("So Chan");
        }else
            System.out.println("So le");

        //Cach 2:


    }
}
