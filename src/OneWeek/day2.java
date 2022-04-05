package OneWeek;

/**
 * 题目描述
 * 题目：判断101-200之间有多少个素数，并输出所有素数
 * --------------------------------------------
 * 解题思路
 * 素数，又称质数，定义是：除了1和它本身外不再有其他的除数整除
 * 判断素数的方法：从2到n-1判断有没有能整除n的数，如果有，则不是素数
 */

//做法一
public class day2 {
//    做法一
//    public static void main(String[] args) {
//        int i,j;
//        for ( i = 101; i <= 200; i++) {
//            for ( j = 2; j <= i - 1; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//            }
//            if (i == j){
//                System.out.println(i + "是素数");
//            }
//        }
//    }
//    做法二
    public static void main(String[] args) {
        //1.定义一个循环，找到101-200之间的全部数据
        for (int i = 101;i <= 200;i++){


            //信号位：标记
            //一开始先认为当前数据是素数
            boolean flag = true;

            //2.判断当前数是否为素数
            for (int j = 2;j < i/2;j++) {
                if(i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("是素数的有" + i + "\t");
            }
        }
    }
    //做法三
//    public static void main(String[] args) {
//        System.out.println("100-200之间的所有素数");
//        for (int i = 100; i < 201;i++){
//            for (int j = 2;j <= (int)Math.sqrt(i);j++){
//                if(i % j==0){
//                    break;
//                }
//                if (j >= (int)Math.sqrt(i)){
//                    System.out.println(i + "\t");
//                }
//            }
//        }
//    }
}


