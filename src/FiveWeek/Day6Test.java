package FiveWeek;

import TwoWeek.Day6;

public class Day6Test {
        public static void main(String[] args) {
            System.out.println("克隆之前：");
            Day6Address address = new Day6Address("中国", "江西", "南昌");// 创建address对象
            Day6Employee employee1 = new Day6Employee("小王", 19, address);// 创建employee1对象
            System.out.println("员工1的信息：");
            System.out.println(employee1);// 输出employee1对象
            System.out.println("克隆之后：");
            Day6Employee employee2 = employee1.clone();// 使用克隆创建employee2对象
            employee2.getAddress().setState("中国"); // 修改员工地址
            employee2.getAddress().setProvince("江西"); // 修改员工地址
            employee2.getAddress().setCity("宜春"); // 修改员工地址
            employee2.setName("大王"); // 修改员工名字
            employee2.setAge(20);// 修改员工年龄
            System.out.println("员工1的信息：");
            System.out.println(employee1);// 输出employee1对象
            System.out.println("员工2的信息：");
            System.out.println(employee2);// 输出employee2对象
        }

    }

