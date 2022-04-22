package FiveWeek;

public class Day4 {
    private String name;
    private int age;

    public Day4() {
    }

    public Day4(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "姓名：" + name + "，年龄"+ age;
    }
}
