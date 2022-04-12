package Threeweek;

import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：输入一个 5 位正整数，判断它是不是回文数。
 * 二、解题思路
 * 例如 12321 是回文数，个位与万位相同，十位与千位相同。
 * 把输入的5位数，分别取个位，十位，千位和万位，判断个位与万位是否相同，判断十位与千位是否相同
 * 三、代码详解
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,unit,tens,kilobit,myriabit;
        System.out.println("请输入一个五位数");
        x = input.nextInt();

            if (x<10000){
                System.out.println(x+"不是一个五位数");
                return;
            }

            unit = x%10;
            tens = x/10%10;
            kilobit = x/1000%10;
            myriabit = x/10000;
            if (unit == myriabit && tens == kilobit){
                System.out.println(x + "是回文数");
            }else {
                System.out.println(x + "不是回文数");
            }
        }

    }

