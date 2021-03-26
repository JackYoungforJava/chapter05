package main;

public class SwitchDetail {
    public static void main(String[] args) {
        /*
        细节1
        * 表达式数据类型，应和case后的常量类型一致，
        * 或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int

        细节2
        switch(表达式)中表达式的返回值必须是:
        (byte，short，int，char，enum[枚举],String)
        不可使用double

        细节3
        case子句中的值必须是常量或常量表达式，不能是变量

        细节4
        default子句是可选的，当没有匹配的case时，执行default

        细节5
        break语句用来在执行完一个case分支后使程序跳出switch语句块；
        如果没有写break，程序会顺序执行到switch结尾，除非遇到break；
        * */
        char c = 'a';
        switch (c){
            case 'a':
                System.out.println("ok");
                break;
            case 'b':
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
        System.out.println("退出switch语句块，程序继续执行...");
    }
}
