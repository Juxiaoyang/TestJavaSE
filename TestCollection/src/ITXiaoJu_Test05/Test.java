package ITXiaoJu_Test05;

import java.util.Comparator;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/25 - 03 - 25 - 16:15
 * @Description: ITXiaoJu_Test05
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Student s1 = new Student("lili",18,170.0);
        Student s2 = new Student("nana",15,163.0);
        //内部比较器
        System.out.println(s1.compareTo(s2));
        Comparator bj1 = new Bijiao2() ;//更改Bijaio()，方法实现比较
        System.out.println(bj1.compare(s1, s2));
    }
}
