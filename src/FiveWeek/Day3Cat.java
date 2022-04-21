package FiveWeek;

import TwoWeek.Day3;

import java.awt.*;

/**
 * 100例
 * 一、题目描述
 * 题目：生命的复杂性，要找到两只一模一样的宠物是不可能的。但在JAVA中，可以通过比较对象的成员变量来判断对象是否相同。本题会创建3只宠物猫，通过比较他们的名字、年龄、重量和颜色属性来看它们是否相同。
 * 二、解题思路
 * 写一个类，名为Cat。
 * 在Cat类中定义4个成员变量，分别是名字、年龄、重量和颜色属性
 * 提供构造方法来设置这些属性值
 * 重写equals()方法和toString()方法。
 * 重写equals方法是为了可以比较两个对象是否相同
 * 重写toString 方法是可以直接 输出对象
 * Java的类都是Object类的直接或间接子类。Object类中定义了equals方法，用于比较两个对象是否相同。这个方法的默认实现是比较两个对象是否是同一个对象而已。
 * 所以我们在定义类时，建议要重写这个equals方法。
 * 三、代码详解
 */
public class Day3Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Day3Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){//如果两个猫咪是同一个对象
            return true;
        }

        if (obj == null){
            return false;
        }
        if (getClass()!= obj.getClass()){
            return false;
        }

        Day3Cat cat = (Day3Cat) obj;
        return name.equals(cat.name) && (age == cat.age) && (weight == cat.weight) && (color.equals(cat.color));
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("名字"+name + "\n");
        sb.append("年龄"+age + "\n");
        sb.append("体重"+weight + "\n");
        sb.append("颜色"+color + "\n");
        return sb.toString();
    }

}
