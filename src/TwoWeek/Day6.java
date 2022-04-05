package TwoWeek;

import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 二、解题思路
 * 以 3 月 5 日为例，应该先把前两个月的加起来，然后再加上 5 天即本年的第几天，特殊情况，
 * 闰年且输入月份大于 3 时需考虑多加一天。
 * 三、代码详解
 */
public class Day6 {
    public static void main(String[] args) {
        int year,month,day,sum = 0,february;
        Scanner input = new Scanner(System.in);

        System.out.println("请输入年份:");
        year = input.nextInt();
        System.out.println("请输入月份:");
        month  = input.nextInt();
        System.out.println("请输入日数:");
        day = input.nextInt();

        //判断是否为闰年
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            february = 29;
        }else{
            february = 28;
        }

        switch (month){
            case 1:
                sum = day;
                break;
            case 2 :
                sum = 31 + day;
                break;
            case 3 :
                sum = 31 + february + day;
                break;
            case 4 :
                sum = 31 * 2 + february + day;
                break;
            case 5 :
                sum = 31 * 2 + 30 + february + day;
                break;
            case 6 :
                sum = 31 * 3 + 30 + february + day;
                break;
            case 7 :
                sum = 31 * 3 + 30 * 2 + february + day;
                break;
            case 8 :
                sum = 31 * 4 + 30 * 2 + february + day;
                break;
            case 9 :
                sum = 31 * 5 + 30 * 2 + february + day;
                break;
            case 10 :
                sum = 31 * 5 + 30 * 3 + february + day;
                break;
            case 11 :
                sum = 31 * 6 + 30 * 3 + february + day;
                break;
            case 12 :
                sum = 31 * 6 + 30 * 4 + february + day;
                break;
        }
        System.out.println(year+"年"+month+"月"+day+"日"+"为这一年的第"+sum+"天");
    }



}
