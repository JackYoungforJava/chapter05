package main.Exercise;

import java.util.Scanner;

public class MulForExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalScore = 0;
        int i = 1;
        int passNum = 0;
        int classNum = 3;//班级数
        int stuNum = 5;//每个班的学生个数
        for (; i <= classNum; i++){   //i代表班级
            double sum = 0;
            int j = 1;
            for (; j <= stuNum; j++){//j代表学生
                System.out.println("请输入第" + i + "个班" + "第" + j + "个学生的成绩:");
                double score = scanner.nextDouble();
                System.out.println("该学生的成绩为:" + score);
                if (score >= 60){
                    passNum++;
                }
                sum += score;
            }
            System.out.println("第" + i + "个班的总成绩为:" + sum + "平均分为:" + (sum / stuNum));
            totalScore += sum;
        }
        System.out.println("所有班的总成绩为:" + totalScore + "平均分为:" + (totalScore / (classNum * stuNum)));
        System.out.println("三个班的及格人数为:" + passNum   );
    }
}
