package main;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        System.out.println("请输入a-g之间的一个字符:");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        switch (c){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            case 'c':
                System.out.println("星期三");
                break;
            case 'd':
                System.out.println("星期四");
                break;
            case 'e':
                System.out.println("星期五");
                break;
            case 'f':
                System.out.println("星期六");
                break;
            case 'g':
                System.out.println("星期天");
                break;
            default:
                System.out.println("您的输入有误，请重新输入！");
        }
        System.out.println("退出了switch语句块，程序继续执行");
    }
}
