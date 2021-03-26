package main.Exercise;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("请输入小写字母:");
        char c = scanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
        //2
        System.out.println("请输入你的成绩:");
        double score = scanner.nextDouble();
        if (score > 100 || score < 0){
            System.out.println("您输入的成绩有误！");
        }else {
            int ratio = (int) (score / 60);
            switch (ratio){
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
            }
        }

        //3
        System.out.println("请输入月份:");
        int month = scanner.nextInt();
        switch (month){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入的月份不对(1-12)");

        }
    }
}
