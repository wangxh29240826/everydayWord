package OneWeek;

import java.util.Scanner;

/**
 *数字加密
 * 需求
 * 1983，采用加密方式进行传输，规则如下：先得到每位数，然后每位数加上5，再对10求余，最后将所有数字反转，得到一串新数字
 */
public class day7 {
    public static void main(String[] args) {
        //1.定义一个数组存入需要加密的数据
        System.out.println("请您输入需要加密的数字个数");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        //2.录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请你输入加密的第" + (i +1) + "个数字：");
            int number = sc.nextInt();
            arr[i] = number;
        }

        //3.打印数字内容看一下
        printArray(arr);
        //4.核心逻辑（对数组中的数据进行加密
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }
        //5.核心逻辑（对数组中的数据加密进行翻转）
        for (int i = 0 ,j = arr.length-1; i < j; i++,j--) {
            //直接交换2者的位置的值即可
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.println("]");
    }
//public static void main(String[] args) {
//    int n1 = 0,n2 = 0,n3 = 0,n4 = 0;
//    String str;
//    Scanner input = new Scanner(System.in);
//
//
//    System.out.println("请输入任意一个字符：");
//    str = input.nextLine();
//
//    for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if((ch >= 65 && ch <= 96)||(ch >= 97 && ch <= 122)){
//            n1++;
//        }else if (ch >= 48 && ch <= 57){
//            n2++;
//        }else if(ch == 32){
//            n3++;
//        }else{
//            n4++;
//        }
//    }
//    System.out.println("英文字符="+n1+"个"+"\n"+"数字="+n2+"个"+"\n"+"空格="+n3+"个"+"\n"+"其他字符"+n4+"个"+"\n");
//}
}
