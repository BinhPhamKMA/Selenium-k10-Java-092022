package Lesson_03;

import java.util.Scanner;

public class Lab03_01 {
    // Count how many odd, even number in integer array
    public static void main(String[] args) {
        int CountOdd = 0;
        int CountEven = 0;
        final int Arr_leghth = 5;
        int[] myIntArr = new int[Arr_leghth];
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập Các giá trị trong mảng :\n");
        for (int index = 0; index < Arr_leghth; index++) {
            System.out.printf("Số thứ  [%d] = \n", index);

            myIntArr[index]= scanner.nextInt();

            }
        for (int index = 0; index < Arr_leghth; index++) {
            if (myIntArr[index]%2 ==0){
                CountEven ++;

            } else {
                CountOdd ++;

            }

        }
        System.out.printf(" Tổng số lượng số chẳn là :%d \n", CountEven );
        System.out.printf(" Tổng số lượng số lẻ là :%d ", CountOdd );


    }
}
