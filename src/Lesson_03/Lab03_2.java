package Lesson_03;

import java.util.Scanner;

public class Lab03_2 {
    public static void main(String[] args) {
        //Max Min

        int min;
        int max;
        final int Arr_leghth = 5;
        int[] myIntArr = new int[Arr_leghth];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập Các giá trị trong mảng :\n");
        for (int index = 0; index < Arr_leghth; index++) {
            System.out.printf("Số thứ  [%d] = \n", index);

            myIntArr[index]= scanner.nextInt();

        }
        max = myIntArr[0];
        System.out.printf(" Số lớn nhất là :%d \n", max );
        for (int index = 0; index < Arr_leghth; index++) {
            if (max < myIntArr[index]){
                max = myIntArr[index];

            }

           // min = myIntArr[0]
           // for (int index = 0; index < Arr_leghth; index++) {
           //     if (min> myIntArr[index]){
           //         min == myIntArr[index];

            //    }

        }
        System.out.printf(" Số lớn nhất là :%d \n", max );
       // System.out.printf(" Số bé nhất là :%d ", min );


    }
}


