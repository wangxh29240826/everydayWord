package FiveWeek;

public class Day5two implements Cloneable{
    private String name;
    private int age;
    private Day5one address;

    public Day5two(String name, int age, Day5one address) {
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

    public Day5one getAddress() {
        return address;
    }

    public void setAddress(Day5one address) {
        this.address = address;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("姓名：" + name + ",");
        sb.append("年龄：" + name + "\n");
        sb.append("地址" + address);
        return sb.toString();
    }

    @Override
    public Day5two clone(){
        Day5two employee = null;
        try {
            employee = (Day5two) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
