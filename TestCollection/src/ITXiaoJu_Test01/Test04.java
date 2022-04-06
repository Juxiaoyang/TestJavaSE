package ITXiaoJu_Test01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/20 - 03 - 20 - 15:27
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test04 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建一个ArrayList集合，存入学生成绩
        Collection col = new ArrayList();
        List list = new ArrayList();
        //加入泛型，编译时进行检查
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(98);
        al.add(94);
        al.add(95);
        al.add(95);
        al.add(93);
        al.add(99);
        //al.add("小鞠");//误存
        for(Integer i:al){
            System.out.println(i);
        }
    }
}
