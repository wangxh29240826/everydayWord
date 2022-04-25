package FiveWeek;

import java.io.*;

public class Day7Test1 {
    public static void main(String[] args) throws Exception{
                System.out.println("序列化之前：");
                Day7Address address = new Day7Address("中国", "江西", "宜春");// 创建address对象
                Day7Employee employee1 = new Day7Employee("小王", 20, address);// 创建employee1对象
                System.out.println("员工1的信息：");
                System.out.println(employee1);// 输出employee1对象
                System.out.println("序列化之后：");
                ObjectOutputStream out = null;
                ObjectInputStream in = null;
                Day7Employee employee2 = null;
                try {
                    out = new ObjectOutputStream(new FileOutputStream("employee.dat"));
                    out.writeObject(employee1);// 将对象写入到本地文件中
                    in = new ObjectInputStream(new FileInputStream("employee.dat"));
                    employee2 = (Day7Employee) in.readObject();// 从本地文件读取对象
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } finally {
                    if (in != null) {
                        try {
                            in.close();// 关闭输入流
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    if (out != null) {
                        try {
                            out.close();// 关闭输出流
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                if (employee2 != null) {
                    employee2.getAddress().setState("中国"); // 修改员工地址
                    employee2.getAddress().setProvince("江西"); // 修改员工地址
                    employee2.getAddress().setCity("南昌"); // 修改员工地址
                    employee2.setName("大王"); // 修改员工名字
                    employee2.setAge(24);// 修改员工年龄
                    System.out.println("员工1的信息：");
                    System.out.println(employee1);// 输出employee1对象
                    System.out.println("员工2的信息：");
                    System.out.println(employee2);// 输出employee2对象
                }

            }

        }
