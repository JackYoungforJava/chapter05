package main;

public class Stars {
    public static void main(String[] args) {
        int level = 10;
        for (int i = 1; i <= level; i++){
            //打印每一层的时候先打印空格   空格数 = 层数 - 当前层
            for (int k = 1; k <= level - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                if (j == 1 || j == 2 * i - 1 || i == level){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
