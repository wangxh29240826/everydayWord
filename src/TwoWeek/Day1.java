package TwoWeek;


import java.util.Scanner;

/**
 * 题目：求 s=a+aa+aaa+aaaa+aa…a 的值，其中 a 是一个数字。
 * 例如 2+22+222+2222+22222(此时共有 5 个数相加)，几个数相加有键盘控制。
 *被加项的值=前一个值*10+2 --》其中2为初始输入的值
 */
public class Day1 {
    public static void main(String[] args) {
        int x ,a ,firstA = 0,sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a的值:");
        a = input.nextInt();
        firstA = a;
        System.out.println("请输入几个数相加:");
        x = input.nextInt();
        --x;
        for (int i = 0; i <= x; i++) {
            sum = sum + a;
            //每一次都是乘10加2,如22*10+2 = 222
            a = a*10+firstA;
        }
        System.out.println(sum);
    }
}
