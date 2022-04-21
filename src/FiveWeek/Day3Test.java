package FiveWeek;

import java.awt.*;

public class Day3Test {
    public static void main(String[] args) {
        Day3Cat cat1 = new Day3Cat("Java",12,21, Color.BLACK);
        Day3Cat cat2 = new Day3Cat("Java",12,21, Color.WHITE);
        Day3Cat cat3 = new Day3Cat("Java",12,21, Color.BLACK);
        System.out.println("猫咪1号" + cat1);
        System.out.println("猫咪2号" + cat2);
        System.out.println("猫咪3号" + cat3);
        System.out.println("猫咪1号是否与猫咪2号相同：" + cat1.equals(cat2));
        System.out.println("猫咪1号是否与猫咪2号相同：" + cat1.equals(cat3));
    }
}
