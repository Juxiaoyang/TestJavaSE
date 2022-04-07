package ITXiaoJu_Test03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/23 - 03 - 23 - 15:39
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        //在cc后添加字符串
        ListIterator<String> it = list.listIterator();
        while(it.hasNext()){
            if("ccc".equals(it.next())){
                it.add("kkk");
            }
           // System.out.println(it.next());
        }
        System.out.println(it.hasNext());
        System.out.println(it.hasPrevious());
        //逆向遍历
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
        System.out.println(list);

    }
}
