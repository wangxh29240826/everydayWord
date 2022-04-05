package TwoWeek.Day2;

public class Day2 {
    public static void main(String[] args) {
        System.out.println("创建对象皇帝1对象：");
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        System.out.println("创建对象皇帝2对象：");
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
        System.out.println("创建对象皇帝3对象：");
        Emperor emperor3 = Emperor.getInstance();
        emperor3.getName();

    }
}
