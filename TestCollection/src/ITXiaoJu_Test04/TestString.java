package ITXiaoJu_Test04;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/24 - 03 - 24 - 15:09
 * @Description: ITXiaoJu_Test_04
 * @version: 1.0
 */
public class TestString {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        HashSet<String> hs = new HashSet<>();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("eee");
        hs.add("fff");
        System.out.println(hs.size());//唯一，无序
        System.out.println(hs);
        /*6
        [aaa, ccc, bbb, eee, ddd, fff]*/
    }
}
