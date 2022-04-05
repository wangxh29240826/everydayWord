package OneWeek;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求，双色球案例
 */



public class day7SystemDemo {
    public static void main(String[] args) {
        //1.随机6个红球号码，不能重复，随机一个篮球号码（1-16）可以采用数组装起来作为中将
        int[] luckNumbers = createLuckNumber();
//        printArray(luckNumbers);

        //2.录入用户选中的号码
        int[] userNumber = userInputNumber();

        //3.判断中奖情况
        judge(luckNumbers, userNumber);

    }

    public static void judge (int[] luckNumber,int[] userNumber) {
        //判断是否中奖了
        //luckNumber = [12,15,16,7,9,21,9];
        //userNumber = [11,13,15,7,9,21,9];
        //1.定义2个变量分别储存红球命中的个数，以及蓝球命中的个数
        int redHitNumber = 0;
        int blueHitNumbers = 0;

        //2.判断红球命中了几个，开始统计
        for (int i = 0; i < userNumber.length-1; i++) {
            for (int j = 0; j < luckNumber.length-1; j++) {
                if(userNumber[i] == luckNumber[j]){
                    redHitNumber++;
                    break;
                }
            }
        }
        //蓝球号码是否命中了
        blueHitNumbers = luckNumber[6] == userNumber[6]?1:0;
        System.out.println("中奖号码是：");
        printArray(luckNumber);
        System.out.println("您投注号码是：");
        printArray(luckNumber);
        System.out.println("您命中了几个红球：" + redHitNumber);
        System.out.println("您是否命中蓝球：" + (blueHitNumbers == 1?"是":"否"));
        //判断中奖情况了
        if (blueHitNumbers == 1&& redHitNumber < 3){
            System.out.println("恭喜您，中了5元小奖！");
        }else if(blueHitNumbers ==1 && redHitNumber == 3
                || blueHitNumbers == 0 && redHitNumber == 4){
            System.out.println("恭喜您，中了10元小奖！");
        }else if(blueHitNumbers ==1 && redHitNumber == 4
                || blueHitNumbers == 0 && redHitNumber == 5){
            System.out.println("恭喜您，中了200元奖！");
        }else if(blueHitNumbers ==1 && redHitNumber == 5){
            System.out.println("恭喜您，中了3000大小奖！");
        }else if(blueHitNumbers ==0 && redHitNumber == 6){
            System.out.println("恭喜您，中了500w元超级奖！");
        }else if(blueHitNumbers ==1 && redHitNumber == 6){
            System.out.println("恭喜您，中了1千万元终极大奖！开始享受人生，诗和远方!!");
        }else{
            System.out.println("感谢您为福利事业作出的突出贡献!!");
        }
    }
    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int[] userInputNumber(){
        //a定义一个数组存储7个号码
        int[] numbers = new int[7];
        //让用户录入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length-1; i++) {
            System.out.println("请输入第" + (i + 1) + "个红球号码（1-33，要求不重复）:");
            int data = sc.nextInt();
            //c把但钱录入的数组存入的数组中去
            numbers[i] = data;

        }

        //b单独录入一个蓝球号码
        System.out.println("请输入蓝球号码（1-16）：");
        numbers[6] = sc.nextInt();
        return numbers;
    }

    public static int[] createLuckNumber() {
        //a.定义一个动态初始化的数组，存储7个数字
        int[] numbers = new int[7];
        //b.遍历数组，为每个位置生成对应的号码（注意：遍历前6个位置，生成6个不重复的红球号码范围是1-33）
        Random r = new Random();
        for (int i = 0; i < numbers.length; i++) {
            while (true) {
                int data = r.nextInt(33) + 1;


                //c注意：必须判断当前随机的这个号码之前是否出现过，出现过就要重新随机一个直到不重复才可以存入
                //定义一个flag变量，默认为data是没有重复的
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if(numbers[j] == data){
                        //data当前数据之前出现过，不能用
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    numbers[i] = data;
                    //data当前数据之前没出现过，可以使用了
                    break;
                }
            }
        }
        numbers[numbers.length-1] = r.nextInt(16)+1;
        return numbers;
    }
}
