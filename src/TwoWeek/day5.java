package TwoWeek;

/**
 * 一、题目描述
 * 题目：一个整数，它加上 100 后是一个完全平方数，再加上 168 又是一个完全平方数，请问该数是多少？
 * 二、解题思路
 * 在 1万以内判断，先将该数加上 100 后再开方，再将该数加上 268 后再开方，如果开方后
 * 的结果满足如下条件，即是结果。
 * 三、代码详解
 */
public class day5 {
    public static void main(String[] args) {
        int i,a = 0,b = 0;
        for (i = 1; i <=10000; i++) {
            a = (int)Math.sqrt(i+100);
            b = (int)Math.sqrt(i+268);
            if (a*a == i+100 && b*b == i+268){
                System.out.println(i +"是完全平方数");
            }
        }
    }
}
