package ForkWeek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：有 n 个人围成一圈，顺序排号。从第一个人开始报数（从 1 到 3 报数），凡报到 3 的人退出圈子，
 * 问最后留下的是原来第几号的那位。
 * 二、解题思路
 * 1、创建一个集合，先给n个人做下标记，集合元素就是位置的号数。
 * 2、因为是n个人围成一圈，报到3的人要退出圈子，然后重新报数。所以要用while循环来处理
 * 3、每次从 1 到 3 报数，报到3的人要退出，要把报到3的人移出集合
 * 4、最后剩下的集合元素就是结果
 */
public class Day3 {
    public static void main(String[] args) {
        int n ,j,x = 1,i = -1;
        List<Integer> list = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("请输入由多少个组成：");
        n = input.nextInt();

        for (j = 0; j <= n; j++) {
            list.add(j);
        }
        //循环，直到长度 = 1
        while (list.size()>1){
            //循环条件x<=3,表示每次点3人
            while (x <= 3){
                if (i == list.size()-1){
                    i = 0;
                }else{
                    i++;
                }
                x++;
            }
            list.remove(i);
            x = 1;
            i = i-1;
        }
        System.out.print("最后留下的是原来第" + list.get(0) + "号");
    }
}
