package main;

public class Diamond {
    public static void main(String[] args) {
        int level = 10;
        //正序
        for (int i = 1; i <= level; i++){
            //打印每一层的时候先打印空格   空格数 = 层数 - 当前层
            for (int k = 1; k <= level - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                if (j == 1 || j == 2 * i - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        //倒序
        for (int l = level - 1; l >= 1; l--){
            for (int n = 1; n <= level - l; n++){
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * l - 1; m++){
                if (m == 1 || m == 2 * l -1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
