package main;

public class WhileStars {
    public static void main(String[] args) {
        int level = 10;
        int i = 1;
        while (i <= level){
            int k = 1;
            while (k <= level - i){
                System.out.print(" ");
                k++;
            }
            int j = 1;
            while (j <= 2 * i - 1){
                if (j == 1 || j == 2 * i - 1 || i == level){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
