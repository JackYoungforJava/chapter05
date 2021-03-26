package main.Exercise;

import java.util.Scanner;

public class TicketingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入年龄");
        int age = scanner.nextInt();
        if (month >= 4 && month <= 10){
            System.out.println("旺季");
            if (age >= 18 && age <= 60){
                System.out.println("60");
            }else if (age < 18){
                System.out.println("30");
            }else if (age > 60){
                System.out.println("20");
            }
        }else {
            System.out.println("淡季");
            if (age >= 18){
                System.out.println("40");
            }else {
                System.out.println("20");
            }
        }
    }
}
