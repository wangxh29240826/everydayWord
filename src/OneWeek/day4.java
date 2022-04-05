package OneWeek;

import java.util.Random;

/**
 * 开发验证码
 *需求
 * 定义方法实现随机产生一个5为的验证码，每位可能是数字，大写字母，小写字母
 *
 */



public class day4 {
//    public static void main(String[] args) {
//        //4.调用方法获取验证码的方法得到一个随机的验证码
//        String code = creatCode(5);
//        System.out.println("验证码是" + code);
//
//    }

    /**
     * 1.定义一个方法返回一个随机验证码，是否需要返回值类型？String 是否需要申明形参，int n
     */
//    public static String creatCode(int n) {
//        //1.定义一个字符串变量记录生成的随机字符
//        String code = "";
//        Random r = new Random();
//        //2.定义for循环，循环n次，依次生成随机字符
//        for (int i = 0; i < n; i++) {
//            //3.定义一个随机字符，英文大写，小写，数字
//            int type = r.nextInt(3);
//            switch (type) {
//                case 0:
//                    //大写字符（A65~Z65+25）
//                    char ch = (char) (r.nextInt(26) + 65);
//                    code += ch;
//                    break;
//                case 1:
//                    char ch1 = (char) (r.nextInt(26) + 97);
//                    code += ch1;
//                    break;
//                case 2:
//                    //数字字符
//                    code += r.nextInt(10);
//                    break;
//                default:
//                    System.out.println("程序错误");
//            }
//        }
//        return code;
//    }
    public static void main(String[] args) {
        /**
         * 题目：将一个正整数分解质因数
         * 例如：输入90，打印90=233*5
         * 对n进行分解质因数，应贤找到一个最小的质数k，然后按下属步骤完成
         * 1.如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可
         * 2.如果n<>k，但n能被k整除，则打印出k的值，并n除以k的商，作为新的正整数n重复执行第一步
         * 3.如果n不能被k整除，则用k+1作为k的值，重复执行第一步
         */
        int i = 2,n = 90;
        //经过演算得出，当n=1时全部因数拆解结束
        while (n>1) {
            //判断是否能够被整除
            if (n % i == 0){
                System.out.println(i);
                n = n/i;
                //条件成立则n则商
            }else {
                i++;
                //不成立则i++,再次判断是否被整除
            }
        }
    }
}