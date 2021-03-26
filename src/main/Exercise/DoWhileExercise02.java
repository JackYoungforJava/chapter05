package main.Exercise;

import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char answer = ' ';
        do {
            System.out.println("还钱吗？y/n");
            answer = scanner.next().charAt(0);
            System.out.println("他的回答是" + answer);
        }while (answer != 'y');
    }
}
