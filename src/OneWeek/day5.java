package OneWeek;

/**
 * 对数组进行复制
 * 需求
 * 把一个数组中的元素复制到另一个数组中去
 */
public class day5 {
//    public static void main(String[] args) {
//        int[] arr1 = {11, 22, 33, 44};
//        int[] arr2 = new int[arr1.length];
//
//        copy(arr1, arr2);
//        prinArry(arr1);
//        prinArry(arr2);
//
//    }
//
//
//    public static void prinArry(int[] arr) {
//        System.out.print("[");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ",");
//        }
//        System.out.println("]");
//    }
//
//
//    public static void copy(int[] arr1, int[] arr2) {
//        //正式完成元素复制
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
//    }
public static void main(String[] args) {
    day5.printLelel(99);
    day5.printLelel(58);
    day5.printLelel(78);
    day5.printLelel(56);

}
private static void printLelel(int result) {
    System.out.println("分数为：" + result + "等级为：");
    if (result >= 99) {
        System.out.println("A");
    }else if (result >= 60 && result <= 89){
        System.out.println("B");
    }else{
        System.out.println("C");
    }
}
}