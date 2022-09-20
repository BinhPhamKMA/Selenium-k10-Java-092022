package Lesson_02;

import java.util.Scanner;

public class Lab02_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Height(m): ");
        double Height = scanner.nextDouble();
        System.out.print("Please Enter Weight(kg) : ");
        double Weight = scanner.nextDouble();

        double BMI = Weight / (Height * 2);
        System.out.println("BMI: " + BMI);
        double soKgChuan = 24 * Height * 2;
        double soKgDu = soKgChuan - Weight;
        double soKgTang = 18.5 * Height * 2;
        double soKgthieu = soKgTang - Weight ;
        System.out.println("Chao ban, Chi so can nang cua ban dang o trang thai: ");

        if (BMI <= 18.5) {
            System.out.printf("\t[+] Ban hoi thieu can - Ban can bo sung dinh duong\n");
            System.out.printf("\t[+] So kg ban can dieu chinh tang nhieu hon  : %f\n", soKgthieu);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("\t[+] Chi so BMI dat tieu chuan - Co gang duy tri nhe ban  (✿◠‿◠)\n");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.printf("\t[+] Chi so BMI cua ban hoi cao 1 xiu roi nhe !!!\n");
            System.out.printf("\t[+] So kg ban can dieu chinh giam di : %f\n", soKgDu);
        } else {
            System.out.printf("\t[+] BMI vuot nguong cho phep -Ban nen co che do an uong & tap duyen tot hon nhe!! Chaizzoo\n");
            System.out.printf("\t[+] So kg ban can dieu chinh : %f\n", soKgDu);
        }
    }
}
