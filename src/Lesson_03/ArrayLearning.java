package Lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        /*Cap phat vung nho*/
        final int Arr_leghth =5;
        int[] myIntArr = new int[Arr_leghth];
        for (int index = 0; index <Arr_leghth; index++){
            myIntArr[index] = index +1;
        }
        for (int index = 0; index <Arr_leghth; index++){
            System.out.println(myIntArr[index]);
        }
        //Enhanced for




    }
}
