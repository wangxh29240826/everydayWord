package Threeweek;

import java.math.BigDecimal;

public class Day6 {
    public static void main(String[] args) {


        double i,j;
        BigDecimal n = new BigDecimal(1);
        BigDecimal sum = new BigDecimal(0);
        for (i = 0; i <= 20; i++) {
            for (j = 1;j<=i;j++){
                n = n.multiply(new BigDecimal(j));
            }
            sum = sum.add(n);
            n = new BigDecimal(1);
        }
        System.out.println(sum);
    }
}
