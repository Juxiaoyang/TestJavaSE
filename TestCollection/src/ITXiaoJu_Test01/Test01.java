package ITXiaoJu_Test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/19 - 03 - 19 - 15:55
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //collection常用方法
        //增加add();
        //删除
        //修改
        //查看
        //判断
        Collection col = new ArrayList();
        Collection col2 = new ArrayList();
        Collection col3 = new ArrayList();
        //集合只能存放引入数据类型
        //自动装箱，对应包装类，
        col.add(18);//int --> integer
        col.add(17);//int --> integer
        col.add(16);//int --> integer
        col.add(15);//int --> integer
        System.out.println(col);
        List list = Arrays.asList(new Integer[]{1,2,3,4});//集合
        col.addAll(list);//添加list集合
        col2.addAll(col);
        System.out.println(col);
        //col.clear();//清空col
        System.out.println(col.size());
        System.out.println(col.isEmpty());
        col.remove(15);
        col2.remove(15);
        System.out.println(col.equals(col2));//true
        System.out.println(col==col2);// false 地址不一定相等
        System.out.println("是否包含元素17："+col2.contains(17));
        System.out.println("hello world...");
        System.out.println("hello world...");
        System.out.println("hello world...");
        System.out.println("hello world...");







    }
}
