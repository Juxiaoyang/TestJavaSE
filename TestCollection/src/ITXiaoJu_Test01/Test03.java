package ITXiaoJu_Test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/19 - 03 - 19 - 16:28
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test03 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        /*
        List接口方法：增加，修改，删除，查看，判断
         */
        List list = new ArrayList();
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        System.out.println(list);
        list.add(5,20);
        System.out.println(list);
        list.set(3,21);//替换
        System.out.println(list);
        list.remove(2);//删掉下标为2的元素
        System.out.println(list);
        System.out.println("-------------1");
        //list遍历
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-------------2");
        for(Object o:list){
            System.out.println(o);
        }
        System.out.println("-------------3");
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
