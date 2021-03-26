package main.Exercise;

public class WhileExercise {
    public static void main(String[] args) {
        int start = 40;
        int end = 200;
        /*while (start <= end){
            if (start % 3 == 0){
                System.out.println(start);
            }
            start++;
        }*/
        while (start <= end){
            if (start % 2 == 0){
                System.out.println(start);
            }
            start++;
        }
    }
}

