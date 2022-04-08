package Threeweek;


/**
 * 一、题目描述
 * 题目：两个乒乓球队进行比赛，各出三人。甲队为 a,b,c 三人，乙队为 x,y,z 三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a 说他不和 x 比，c 说他不和 x,z 比，请编程序找出三队赛手的名单。
 * 二、解题思路
 * a,b,c三位选手，所对应的对手都可能是x,y,z
 * 所以就是三个数组，里面有x,y,z三个值
 * a 说他不和 x 比，c 说他不和 x,z 比，要做一个判断
 * 然后是抽签决定比赛名单，所以不能和同一名对手比赛
 * 所以只要嵌套循环a,b,c三个数组，在最里层循环里添加判断条件即可。
 * 三、代码详解
 */
public class Day3 {
    public static void main(String[] args) {
        int i,j,k;
        char first[] = {'x','y','z'};
        char second[] = {'x','y','z'};
        char third[] = {'x','y','z'};

        for (i = 0;  i <= 2; i++) {
            for(j = 0;j <= 2;j++){
                for (k = 0;k <= 2;k++){
                    if ((i != 0 && k!= 0 && k!=2)&&(i != j && j!= k && k!= i)){
                        System.out.println("a"+"→"+ first[i] + "\n" + "b" + "→" + second[j] + "\n" + "c" + "→" + third[k]);
                    }
                }
            }

        }
    }
}
