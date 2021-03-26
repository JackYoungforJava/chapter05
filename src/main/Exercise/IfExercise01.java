package main.Exercise;

import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        /*double d1 = 11.8;
        double d2 = 19.7;
        if (d1 > 10.0 && d2 < 20.0){
            System.out.println(d1 + d2);
        }*/
        /*int num1 = 15;
        int num2 = 30;
        int num3 = num1 + num2;
        if (num3 % 3 == 0 && num3 % 5 == 0){
            System.out.println("ok");
        }else {
            System.out.println("not ok");
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        if ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"不是闰年");
        }
    }
}
