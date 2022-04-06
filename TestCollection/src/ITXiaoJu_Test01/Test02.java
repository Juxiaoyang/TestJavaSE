package ITXiaoJu_Test01;

import java.util.*;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/19 - 03 - 19 - 16:13
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Collection col = new ArrayList();
        List list = Arrays.asList(new Integer[]{11,12,13,14,15,16,17});
        col.addAll(list);
        //对集合遍历
        //普通for循环
       /* for (int i = 0; i < col.size(); i++) {
            col.
        }*/
       //增强for循环
        for (Object o:col){
            System.out.println(o);
        }//Yes
        System.out.println("-----------");
        //方法3
        Iterator it  = col.iterator();//Iterator 迭代器
        while(it.hasNext()){//hasNext();判断是否有下一个元素
            System.out.println(it.next());//next();将元素获取到，指针下移
        }
    }
}
