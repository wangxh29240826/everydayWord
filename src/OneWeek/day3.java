package OneWeek;


import java.util.Scanner;

/**
 * 买飞机票案例
 * 需求
 * 1.机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱
 * 2.机票最脏优惠价格的计算方案如下：旺季（5-10月）头等舱9折经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
 */
public class day3 {
    public static void main(String[] args) {
//        //目标：完成买飞机票的价格计算
//        //1.让用户输入机票原价，月份，仓位类型
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入机票原价:");
//        double money = sc.nextInt();
//
//        System.out.println("请输入机票的月份（1-12）"+"淡季是（11-4）"+"旺季是（5-10）");
//        int month = sc.nextInt();
//
//        System.out.println("请输入选择仓位类型:");
//        String type = sc.next();
//        System.out.println("机票优惠后的价格是：" + calc(money,month,type));
//    }
//
//    //4.调用方法输出价格
//
//
//    //2.定义方法接收信息，统计优惠后的价格返回
//    public static double calc(double money,int month,String type){
//        //3.判断用户选择的信息情况
//        if (month >= 5 && month <= 10){
//            //旺季
//            switch (type){
//                case "头等舱":
//                    money *= 0.9;
//                    break;
//                case "经济舱":
//                    money *= 0.85;
//                    break;
//                default:
//                    System.out.println("您输入的仓位类型有误~");
//            }
//        }else if(month == 11 || month == 12 || month >= 1 && month <= 4){
//            //淡季
//            switch (type){
//                case "头等舱":
//                    money *= 0.7;
//                    break;
//                case "经济舱":
//                    money *= 0.65;
//                    break;
//                default:
//                    //表示无法计算当前价格
//                    return -1;
//            }
//        }else {
//            System.out.println("对不起，您输入的月份有问题~~");
//            //表示无法计算当前价格
//            money = -1;
//        }
//        return money;
        for (int i = 101; i < 999; i++) {
            if(Math.pow(i%10,3) + Math.pow(i/10%10,3)+Math.pow(i/100,3) == i){
                System.out.println(i + "是水仙花数");
            }
        }
    }
}
