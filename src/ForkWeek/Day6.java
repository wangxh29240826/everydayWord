package ForkWeek;

import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        long number = sc.nextLong();
        System.out.println("你输入的数字是：");
        System.out.println("该数乘以2的结果是：" + number);
        System.out.println("该数乘以4的结果是：" + (number<<1));
        System.out.println("该数乘以8的结果是：" + (number<<3));
        System.out.println("该数乘以16的结果是：" + (number<<4));
    }
}
