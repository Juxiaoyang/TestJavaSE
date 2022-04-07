package ITXiaoJu_Test04;

import java.util.HashSet;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/24 - 03 - 24 - 15:06
 * @Description: ITXiaoJu_Test_04
 * @version: 1.0
 */
public class TestInteger {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        HashSet<Integer> hs = new HashSet<>();
        hs.add(11);
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(11);
        hs.add(12);
        System.out.println(hs.size());//唯一，无序
        System.out.println(hs);
        /*4
        [11, 12, 13, 14]*/
    }
}
