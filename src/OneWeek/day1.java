package OneWeek;

/**
 *题目：古典问题：有一对兔子，从出生后第三个月起每个月都生一对新兔子，
 * 小兔子长到第三个月后又生一对新兔子，假如兔子不会死的情况下，每个月兔子对数为多少
 */
//----------------------------------------------

/**
 * 兔子的总数规律这样的：
 * 第一个月1对
 * 第二个月1对
 * 第三个月2对
 * 第四个月3对
 * 第5个月5对
 * 第六个月8对
 * 第7个月13对
 * 第八个月21对
 * --------------------------------
 * 是不是很像斐波那契数列，从第三个数开始后面的每个数就是前两个数之和
 */
public class day1 {
    public static void main(String[] args) {
        //兔子的规律为数列1，1，2，3，5，8，13，21……
        //预设显示的最大月份
        int maxMonth = 20;
        int first = 1;
        int second = 1;
        int third = 0;
        for (int i = 1; i <= maxMonth; i++) {
            first = second;
            second = third;
            third = first + second;
            System.out.println("第" + i + "月兔子的数量为=" + third + "对");
        }
    }
}
