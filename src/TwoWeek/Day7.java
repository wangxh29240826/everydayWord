package TwoWeek;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：输入三个整数 x,y,z，请把这三个数由小到大输出。
 * 二、解题思路
 * 我们想办法把最小的数放到 x 上，先将 x 与 y 进行比较，如果 x> y 则将 x 与 y 的值进行交
 * 换，然后再用 x 与 z 进行比较，如果 x> z 则将 x 与 z 的值进行交换，这样能使 x 最小。
 */
public class Day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x,y,z,t;

        System.out.println("请输入第一个整数");
        x = input.nextInt();
        System.out.println("请输入第二个整数");
        y = input.nextInt();
        System.out.println("请输入第三个整数");
        z = input.nextInt();

        List<Integer> sortList = new ArrayList<Integer>();
        sortList.add(x);
        sortList.add(y);
        sortList.add(z);
        sortList.sort(Comparator.naturalOrder());
        System.out.println("由小到大依次为：");
        for (Integer integer : sortList){
            System.out.println(integer + " ");
        }
    }
}
