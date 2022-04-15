package ForkWeek;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 一、题目描述
 * 题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 二、解题思路
 * （插入排序）首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后
 * 的数，依次后移一个位置。
 * 三、代码详解
 */
public class Day1 {
    public static void main(String[] args) {
                int i,x;
                Scanner input =  new Scanner(System.in);
                ArrayList<Integer> list = new ArrayList<Integer>();
                int arr[] = { 2, 9, 12, 23, 31, 47, 52, 78, 89, 95 };
                System.out.print("请输入需要插入的数字：");
                x=input.nextInt();

                for (i = 0; i < arr.length; i++){
                    //把静态数组全部赋值给动态数组
                    list.add(arr[i]);
                }

                for (i = 0; i < arr.length; i++){
                    //用需要插入的数字与数组中的每一位进行对比
                    //此时i的值则说明了该数处于数组中的位置
                    if(x<list.get(i)){
                        //把数字插入到数组中的第i位。
                        list.add(i,x);
                        break;
                    }

                }
                for (i = 0; i < list.size(); i++){
                    System.out.print(list.get(i)+" ");
                }
            }
        }

