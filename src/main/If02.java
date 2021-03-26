package main;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        System.out.println("请输入你的年龄");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 18){
            System.out.println("大于18");
        }else {
            System.out.println("小于18");
        }
    }
}
