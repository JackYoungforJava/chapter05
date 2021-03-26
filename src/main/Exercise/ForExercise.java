package main.Exercise;

public class ForExercise {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int multiple = 9;
        for (int i = start ; i <= end; i++){
            if (i % multiple == 0){
                count++;
                sum += i;
            }
        }
        System.out.println("个数=" + count);
        System.out.println("总和=" + sum);
    }
}
