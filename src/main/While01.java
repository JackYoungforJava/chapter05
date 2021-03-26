package main;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10){
            System.out.println("你好" + i);
            i++;
        }
        System.out.println("退出While循环..." + i);
    }
}
