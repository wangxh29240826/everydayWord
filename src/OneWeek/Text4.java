package OneWeek;

import java.util.Random;
import java.util.Scanner;

public class Text4 {
    public static void main(String[] args) {
        //4.调用方法
        String code = CreatCode(5);
        System.out.println("验证码是："+code);
    }

    private static String CreatCode(int n) {
        String code = "";
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    char ch = (char)(r.nextInt(26)+97);
                    code += ch;
                    break;
                case 1:
                    char ch1 = (char)(r.nextInt(26)+65);
                    code += ch1;
                    break;
                case 2:
                    code += r.nextInt(10);
                    break;
                default:
                    System.out.println("报错");
            }
        }
        return code;
    }
}
