package ForkWeek;

import java.util.*;

/**
 * 二、解题思路
 * 1、把参与的人员加到集合中
 * 2、使用Random对象获取随机数
 * 3、把随机数当下标，获取集合中的幸运用户
 * 三、代码详解
 */
public class Day7 {
    public static void main(String[] args) {
//        List<String> luckUseNames = getLuckUserNames();
//        Random random = new Random();
//        int luckNum = random.nextInt(6);
//        System.out.println("未来的幸运未来大佬是：" + luckUseNames.get(luckNum));
//    }
//
//    private static List<String> getLuckUserNames() {
//    List<String> luckUserNames = new ArrayList<String>();
//
//    luckUserNames.add("小王同学");
//    luckUserNames.add("jason佬");
//    luckUserNames.add("Ara同学");
//    luckUserNames.add("李佬");
//    luckUserNames.add("虚竹佬");
//    return luckUserNames;



        List<String> luckUserNames = getLuckUserNames();
    
        Random random = new Random();
        Map<Integer,Integer> luckNumMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            int luckNum = random.nextInt(4);
            Integer count = luckNumMap.get(luckNum);
            if (count == null){
                count = 0;
            }
            ++count;
            luckNumMap.put(luckNum,count);
        }
        Integer maxLuckNum = 0;
        Integer maxCount = 0;
        for (Integer luckNum : luckNumMap.keySet()) {
            if (maxCount < luckNumMap.get(luckNum)) {
                maxLuckNum = luckNum;
            }
            System.out.println(luckUserNames.get(luckNum) + "同学的幸运值" + luckNumMap.get(luckNum));
        }
        System.out.println("本周学习打卡积分第一且是幸运的未来大佬是：" + luckUserNames.get(maxLuckNum));
    }

    private static List<String> getLuckUserNames() {
    List<String> luckUserNames = new ArrayList<String>();
    luckUserNames.add("小王同学");
    luckUserNames.add("虚竹佬");
    luckUserNames.add("李佬");
    luckUserNames.add("Ara同学");
    luckUserNames.add("jason佬");
    return luckUserNames;
    }
}
