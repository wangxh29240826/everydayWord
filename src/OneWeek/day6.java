package OneWeek;


import java.util.Scanner;

/**
 * 评委打分
 * 需求
 * 有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为：去掉最高分和最低分后4个评委的平均分
 *
 */
public class day6 {
//    public static void main(String[] args) {
//        //1定义一个动态初始化的数组，用于后期录入6个评委的分数
//        int[] scores = new int[6];
//
//        //2.录入6个评委的分数
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println("请您输入第" + (i + 1) + "个评委的打分");
//            int score = sc.nextInt();
//            //3.把这个分数存入到数组的对应位置处
//
//            scores[i] = score;
//        }
//
//        //3.遍历数组中的每个数据，找出最大值和最小值
//        int max = scores[0];
//        int min = scores[0];
//        int sum = 0;
//        for (int i = 0; i < scores.length; i++) {
//            if (scores[0] > max){
//                max = scores[0];
//            }
//            if (scores[0] < min){
//                min = scores[0];
//            }
//            sum += scores[i];
//        }
//        double result = (sum - max -min)*1.0 /(scores.length-2);
//        System.out.println("选手最终得分" + result);
//    }
    public static void main(String[] args) {
        int m,n,j,i;
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个正整数：");
        m = input.nextInt();
        System.out.println("请再输入一个正整数：");
        n = input.nextInt();
        //循环从n和m中最小的数开始~2，如果m，n都可以整除，则是最大公约数
        for (i = Math.min(m,n);i>=2;i--){
            //判断n和m是否能够整除i
            if (m%i==0 && n%i ==0){
                System.out.println(i+"最大公约数");
                break;
            }
        }
        if (i==1){
            System.out.println("没有最大公约数");
        }
        for (Math.max(m,n);i < m*n;i++) {
            if (i%m == 0 && i%n == 0){
                System.out.println(i + "是最小公倍数");
                break;
            }
        }
    }
}
