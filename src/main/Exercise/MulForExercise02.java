package main.Exercise;

public class MulForExercise02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){//i代表一行的个数
            for (int j = 1; j <= i; j++){//j代表行数
                System.out.print(j + " " + "*" + " "+ i + " " + "=" + (j * i) + "\t");
            }
            System.out.print("\n");
        }
    }
}
