package FiveWeek;

/**
 * 克隆一
 */
public class Day4Test {
    public static void main(String[] args) {
        System.out.println("克隆之前：");
        Day4 employee1 = new Day4();
        employee1.setName("小王");
        employee1.setAge(19);
        System.out.println("员工1信息");
        System.out.println(employee1);
        System.out.println("克隆之后");
        Day4 employee2 = employee1;
        employee2.setName("大王");
        employee2.setAge(20);
        System.out.println("员工1的信息");
        System.out.println(employee1);
        System.out.println("员工2的信息");
        System.out.println(employee2);

    }
}
