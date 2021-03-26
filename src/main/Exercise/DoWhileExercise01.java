package main.Exercise;

public class DoWhileExercise01 {
    public static void main(String[] args) {
        /*int i = 1;
        int sum = 0;
        do {
            System.out.println("i=" + i);
            sum += i;
            i++;
        }while (i <= 100);
        System.out.println("sum=" + sum);*/

        int start = 1;
        int count = 0;
        do {
            if (start % 5 == 0 && start % 3 != 0){
                count++;
            }
            start++;
        }while (start <= 200);
        System.out.println(count);
    }
}
