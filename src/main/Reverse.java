package main;

public class Reverse {
    public static void main(String[] args) {
        int level = 5;
        for (int i = level - 1; i >= 1; i--){
            for (int k = 1; k <= level - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                if (j == 1 || j == 2 * i -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
