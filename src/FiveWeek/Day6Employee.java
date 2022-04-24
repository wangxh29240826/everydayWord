package FiveWeek;

import TwoWeek.Day6;

public class Day6Employee implements Cloneable{
    private String name; // 表示员工的姓名
    private int age; // 表示员工的年龄
    private Day6Address address;// 表示员工的地址

    public Day6Employee(String name, int age, Day6Address address) {// 利用构造方法进行初始化
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Day6Address getAddress() {
        return address;
    }

    public void setAddress(Day6Address address) {
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

    @Override
    public Day6Employee clone() {// 实现浅克隆
        Day6Employee employee = null;
        try {
            employee = (Day6Employee) super.clone();
            employee.address = address.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
}


