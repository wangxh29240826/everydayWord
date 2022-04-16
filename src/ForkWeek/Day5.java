package ForkWeek;

import java.util.Scanner;

/**
 * 一、题目描述
 * 题目： 通过位运算的异或运算符“^”,把字符串与一个指定的值进行异或运算，从而改变字符串中每个字符的值，这样就可以得到一个加密后的字符串。
 * 二、解题思路
 * 1、异或运算。
 * 2、如果某个字符(或数值) x 与一个数值 m 进行异或运算得到有 y ,则再用 y 与 m 进行异或运算就可以还原为 x ，因此这个原理可以实现加密和解密功能。
 */
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或者解密字符串：");
        String passWord = sc.nextLine();
        char[] array = passWord.toCharArray();
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (char) (array[i] ^ 20000);
        }
        System.out.println("加密结果：");
        System.out.println(new String(array));
    }
}
