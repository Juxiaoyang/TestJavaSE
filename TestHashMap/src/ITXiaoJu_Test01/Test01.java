package ITXiaoJu_Test01;

import java.util.HashMap;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 22:21
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建HashMap的对象,存储：一对数据
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(2131,"lili");
        hm.put(5431,"nana");
        hm.put(6563,"riri");
        hm.put(2131,"uuuu");
        hm.put(6226,"dfsf");
        hm.put(2626,"ssfs");
        System.out.println(hm.size());
        System.out.println(hm);//无序，唯一
    }
}
