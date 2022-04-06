package ClimbDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Climb {
    public static void main(String[] args) {
        String rs = "来黑马程序学习Java，电话020-43422424，或者联系邮箱" +
                "itcast@itcasst.cn,电话17354779620 " +
                "邮箱2924773828@qq.com，400-100-3233，4001003232";

        //需求，从上面的内容中爬取出电话号码和邮箱
        //1.定义爬取规则，字符串形式
        String regex = "(\\w{1,30}@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2})|(1[3-9]\\d{9})" +
                "|(0\\d{2,6}-?\\d{5,20})|(400-?\\d{3,9}-?\\d{3,9})";

        //2.把这个爬取规则编译成匹配对象
        Pattern pattern = Pattern.compile(regex);

        //3.得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);

        //4.开始找
        while (matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}
