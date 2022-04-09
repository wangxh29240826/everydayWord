package Threeweek;

/**
 * 一需求
 *     打印菱形
 * 二、解题思路
 * 先把图形分成两部分来看待：
 * 前四行一个规律，后三行一个规律
 * 利用双重 for 循环，第 一层控制行，第二层控制列。
 */
public class Day4 {
    public static void main(String[] args) {
        int i,j,k;
        for (i = 0; i <= 3; i++) {
            for (j = i;j <= 3;j++) {
                System.out.print(" ");
            }
            for (k = 0;k <= 2*i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 2;i >= 0;i--){
            for (j = 2;j >= i-1;j--){
                System.out.print(" ");
            }
            for (k=i*2;k >= 0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
