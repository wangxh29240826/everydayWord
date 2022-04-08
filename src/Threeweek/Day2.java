package Threeweek;

public class Day2 {
//    public static void main(String[] args) {
//        int[] arr = {5,6,7,10,20,70,88,100};
//        System.out.print(binarySearch(arr,100));
//    }
//
//    /**
//     * 二分法
//     * @param arr
//     * @param data
//     * @return
//     */
//    public static int binarySearch(int[] arr,int data){
//        //1.定义左边位置和右边位置
//        int left = 0;
//        int right = arr.length - 1;
//
//        //2.开始循环，折半查询
//        while(left <= right){
//            //取中间索引
//            int middleIndex = (left + right) / 2;
//            //3.判断当前中间位置前与那苏和要找前元素的大小情况
//            if(data > arr[middleIndex]){
//                //往右边找，左位置更新为= 中间索引+1
//                left = middleIndex + 1;
//            }else if (data < arr[middleIndex]){
//                right = middleIndex - 1;
//            }else{
//                return middleIndex;
//            }
//        }
//        return -1;
//    }

    /**
     * 一、题目描述
     * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上
     * 又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下 的一半零一个。到第 10 天
     * 早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
     * 二、解题思路
     * 采取逆向思维的方法，从后往前推断。
     * 前一天桃子的数量为（当前的＋１）*２，循环递减可得出结论。
     */
    public static void main(String[] args) {
        int i,sum = 1;

        for (i = 10; i > 1 ; i--) {
            sum = (sum + 1)*2;

        }
        System.out.println("第一天共有" + sum + "只桃子");
    }
}
