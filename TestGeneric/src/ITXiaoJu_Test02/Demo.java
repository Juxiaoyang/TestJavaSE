package ITXiaoJu_Test02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/21 - 03 - 21 - 15:52
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Demo {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //通配符
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        //G<A> G<B>并列
        //G<?>是G<A> G<B>的父类
        List<?> list = null;
        list = list1;
        list = list2;
        list = list3;
    }
}
