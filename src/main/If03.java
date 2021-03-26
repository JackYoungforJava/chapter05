package main;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("请输入芝麻信用分(1--100):");
            int integral = scanner.nextInt();
            if (integral >= 1 && integral <= 100){
                if (integral == 100){
                    System.out.println("信用极好");
                }else if (integral > 80 && integral <= 99){
                    System.out.println("信用优秀");
                }else if (integral >= 60 && integral <= 80){
                    System.out.println("信用一般");
                }else {
                    System.out.println("信用不及格");
                }
            }else {
                System.out.println("输入范围有误，请重新输入:");
            }
        }catch (Exception e){
            System.out.println("请输入1-100的数字");
        }
    }
}
