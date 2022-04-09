package Threeweek;

import java.math.BigDecimal;

/**
 * 一、题目描述
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前 20 项之和。
 * 二、解题思路
 * 请抓住分子与分母的变化规律
 * 分子是前一项分子与分母的和，分母是前一项的分子
 * 涉及到小位数的计算，可以考虑用BigDecimal
 * 三、代码详解
 */
public class Day5 {
    public static void main(String[] args) {
        BigDecimal molecule = new BigDecimal(2);
        BigDecimal denominator = new BigDecimal(1);
        BigDecimal t = new BigDecimal(0);
        BigDecimal sum = new BigDecimal(0);
        int i;

        for (i = 0; i <= 20; i++) {
            //计算其和
            sum = sum.add(molecule.divide(denominator,4,BigDecimal.ROUND_HALF_UP));
            t = molecule;
            molecule = molecule.add(denominator);
            denominator = t;

        }
        System.out.println(sum);
    }



}
