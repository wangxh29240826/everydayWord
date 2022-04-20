package FiveWeek;

public class Day2Test {
    public static void main(String[] args) {

                Day2 person1 = new Day2();// 创建对象
                Day2 person2 = new Day2("Ara~", "男",19 );// 创建对象
                System.out.println("员工1的信息");
                System.out.println("员工姓名：" + person1.getName()); // 输出姓名
                System.out.println("员工性别：" + person1.getGender()); // 输出性别
                System.out.println("员工年龄：" + person1.getAge()); // 输出年龄
                System.out.println("员工2的信息");
                System.out.println("员工姓名：" + person2.getName()); // 输出姓名
                System.out.println("员工性别：" + person2.getGender()); // 输出性别
                System.out.println("员工年龄：" + person2.getAge()); // 输出年龄
            }
        }