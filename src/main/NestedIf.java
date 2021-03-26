package main;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        double score = scanner.nextDouble();
        if (score > 8.0){
            System.out.println("请输入性别");
            char gender = scanner.next().charAt(0);
            if (gender == '男'){
                System.out.println("恭喜你进入男子组，你的成绩为:"+score);
            }else if (gender == '女'){
                System.out.println("恭喜你进入女子组,你的成绩为:"+score);
            }else {
                System.out.println("你输入的性别有误,请重新输入");
            }
        }else {
            System.out.println("淘汰");
        }
    }
}
