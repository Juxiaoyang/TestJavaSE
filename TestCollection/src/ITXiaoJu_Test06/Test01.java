package ITXiaoJu_Test06;

import java.util.TreeSet;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/25 - 03 - 25 - 23:22
 * @Description: ITXiaoJu_Test06
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建TreeSet
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(66);
        ts.add(22);
        ts.add(33);
        ts.add(44);
        ts.add(55);
        System.out.println(ts.size());
        System.out.println(ts);//有序的，按照升序排列的

    }
}
