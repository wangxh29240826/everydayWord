package FiveWeek;


/**
 * 一、题目描述
 * 题目： JAVA是万物都是对象，要有对象首先要脱单~，哈哈哈，不对，是new个对象，使用构造方法获得对象，但你知道吗？构造方法也支持重载噢
 * 二、解题思路
 * 构造方法是一种特殊的方法，在声明时要遵守规定：
 * （1）构造方法的方法名必须与类名相同。
 * （2）构造方法没有返回类型，也不能定义为void，在方法名前面不声明方法类型。
 * （3）构造方法的主要作用是完成对象的初始化工作，它能够把定义对象时的参数传给对象的域。
 * （4）一个类可以定义多个构造方法，如果在定义类时没有定义构造方法，则编译系统会自动插入一个无参数的默认构造器，这个构造器不执行任何代码。
 * （5）构造方法可以重载，以参数的个数，类型，顺序。
 * 三、代码详解
 */
public class Day2 {
    private String name;
    private String gender;
    private int age;

    public Day2() {
        System.out.println("使用无参构造方法创建对象");
    }

    public Day2(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        System.out.println("使用有参构造方法创建对象");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
