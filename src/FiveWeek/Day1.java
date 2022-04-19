package FiveWeek;

/**
 * 一、题目描述
 * 题目：有 1、2、3、4 个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 二、解题思路
 * 可填在百位、十位、个位的数字都是 1、2、3、4。组成所有的排列后再去掉不满足条件
 * 的排列。
 * 三、代码详解
 */
public class Day1 {
    static int ans = 0;

    public static void main(String[] args) {
        //用i，j，k来表示数字的各三位，利用循环组成所有可能的数字
        //通过三个数字各不相同的判断，得出所有不重复的数字
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4;j++){
                for (int k = 1;k <= 4;k++){
                    //判断三个数字各不相同
                    if (i != j && j != k && k != i){
                        System.out.println("不重复的数=" +i+j+k);
                        ans++;
                    }
                }
            }
        }
        System.out.println("符合条件的个数：" + ans);
    }
}
