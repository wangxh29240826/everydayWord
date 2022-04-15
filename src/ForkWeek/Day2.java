package ForkWeek;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：有 n 个整数，使其前面各数顺序向后移 m 个位置，最后 m 个数变成最前面的 m 个数
 * 二、解题思路
 * 使用list的remove和add来实现
 */
public class Day2 {
    public static void main(String[] args) {
        int m,i;
        int []s = new int[100];
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();


        System.out.println("请输入10个整数：");
        for (i = 1;i <= 10;i++){
            System.out.println("第" + i + "整数：");
            list.add(input.nextInt());
        }

        System.out.print("请输入后移的位数：");
        //m为后移多少位
        m = input.nextInt();

        for (i = 1;i <= m;i++){
            //把需要放到前面的m的数依次赋值给数组s[]
            s[i-1] = list.get(list.size()-1);
            //然后删除动态list
            list.remove(list.size()-1);
        }
        for (i = 1; i <= m; i++) {
            //把数组s[]中的值，依次插入到动态list的第0位
            list.add(0,s[i-1]);
        }

        for (i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
