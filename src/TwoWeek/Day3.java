package TwoWeek;


/**
 *题目描述
 * 题目：一个数如果恰好等于它的因子之和，这个数就成为完数
 * 例如6 = 1+2+3
 * 需求
 * 找出1000以内的所有完数
 *代码详解
 */
public class Day3 {
    public static void main(String[] args) {
        int i ,j ,sum = 0;
        //1.先遍历1000以内的数字
        for (i = 2; i<= 1000; i++) {
            //2.循环条件从1~j-1
            for (j = 1; j < i; j++) {
                //判断i是否能整除j
                if(i%j == 0){
                    //成立则进行加法计算
                    sum = sum +j;
                }
            }
            if(sum == i){
                //判断做加法的和是否为i的值，成立则是完数
                System.out.println(i+"是完数");
            }
            //每次计算清空
            sum = 0;
        }
    }
}
