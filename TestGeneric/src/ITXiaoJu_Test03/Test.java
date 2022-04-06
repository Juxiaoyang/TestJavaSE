package ITXiaoJu_Test03;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/21 - 03 - 21 - 16:10
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        List<Object> a = new ArrayList<>();
        List<Person> b = new ArrayList<>();
        List<Student> c = new ArrayList<>();//泛型继承，三个集合是并列关系
        //开始使用泛型受限
        /*泛型的上限
        * List<? extends Person>是List<Person>的父类，是List<Person的子类>的父类*/
        List<? extends Person> list1 = null;
       /* list1 =a;//报错
        list1 =b;
        list1 =c;*/
       //泛型的下限
        //List<? super Person>是List<Person>的父类，是List<Person的父类>的父类
        List<? super Person> list2 = null;
        /*list2 =a;
        list2 =b;
        list2 =c;//报错*/

    }
}
