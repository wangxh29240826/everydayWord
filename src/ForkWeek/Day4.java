package ForkWeek;

import java.math.BigDecimal;

/**
 * 一、题目描述
 * 题目：一球从 100 米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第 10 次落地时，
 * 共经过多少米？第 10 次反弹多高？
 * 二、解题思路
 * 要求经过多少米，要注意的是：
 * 1、第一次落地是100米，所以循环要从第二次开始算
 * 2、每次球经过的距离是弹起高度的2倍（实质上是弹起+落下）
 * 第10次反弹多高，只要有个变量来保存（每次球经过的距离除以2）就行了。
 * 三、代码详解
 */
public class Day4 {
    //不正规示例
//    public static void main(String[] args) {
//        double sum = 100;
//        double H = sum/2;
//        //做9次循环，第一次直接加上100米。之后用循环来计算
//        for (int i = 2; i < 11; i++) {
//            //每次球经过的距离是弹起高度的2倍
//            sum = sum+2*H;
//            //每次弹起的高度是上次的1/2
//            H = H/2;
//        }
//        System.out.println("第10次落地时，共经过" + sum+ "米");
//        System.out.println("第10次落地时，共经过" + H+ "米");
//    }
    public static void main(String[] args) {
       //正规示例
        BigDecimal sum = new BigDecimal(100);
        final BigDecimal factor = new BigDecimal(2);
        BigDecimal height = sum.divide(factor);
        for (int i = 2; i < 11; i++) {
            sum = sum.add(height.multiply(factor));
            height = height.divide(factor);
        }
        System.out.println("第10次落地时，共经过" + sum+ "米");
        System.out.println("第10次落地时，共经过" + height+ "米");
    }

}
