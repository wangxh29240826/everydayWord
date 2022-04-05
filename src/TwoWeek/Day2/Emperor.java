package TwoWeek.Day2;
/**
        * 1.题目描述
        * 题目：使用单例模式来保证皇帝的唯一性
        * 2.解题思路
        * 1.使用单例模式的特点仅能获取一个对象，伪类防止其他用户创建对象，需要将构造方法设置成private
        * 2.然后提供一个静态方法，该方法返回这个类的对象
        * 3.代码详解
        */
public class Emperor {
    /**
     *     1.声明一个Emperor类的引用
     */
    private static Emperor emperor = null;
    //2.将构造方法私有
    private Emperor(){

    }
    //3.实例化引用
    public static Emperor getInstance() {
        if (emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    //使用普通方法输出皇帝的名字
    public void getName (){
        System.out.println("我是皇帝：Are~追着风跑");
    }
}
