package FiveWeek;

import java.io.Serializable;

public class Day7Employee implements Serializable {
        private static final long serialVersionUID = 3049633059823371192L;
        private String name; // 表示员工的姓名
        private int age; // 表示员工的年龄
        private Day7Address address;// 表示员工的地址

        public Day7Employee(String name, int age, Day7Address address) {// 利用构造方法初始化各个域
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public Day7Employee() {// 利用构造方法初始化各个域
            super();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Day7Address getAddress() {
            return address;
        }

        public void setAddress(Day7Address address) {
            this.address = address;
        }

        @Override
        public String toString() {// 重写toString()方法
            StringBuilder sb = new StringBuilder();
            sb.append("姓名：" + name + ", ");
            sb.append("年龄：" + age + "\n");
            sb.append("地址：" + address);
            return sb.toString();
        }

    }

