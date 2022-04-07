package ITXiaoJu_Test04;

import java.util.HashSet;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/24 - 03 - 24 - 15:13
 * @Description: ITXiaoJu_Test_04
 * @version: 1.0
 */
public class TestStudent {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        HashSet<Student> hs = new HashSet<>();
        hs.add(new Student(18,"lili"));
        hs.add(new Student(19,"lili"));
        hs.add(new Student(19,"lili"));
        hs.add(new Student(21,"lili"));
        hs.add(new Student(22,"lili"));
        System.out.println(hs.size());
        System.out.println(hs);//
    }
}
