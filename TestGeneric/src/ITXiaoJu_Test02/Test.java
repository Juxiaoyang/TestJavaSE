package ITXiaoJu_Test02;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/21 - 03 - 21 - 15:56
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test {
    public void a(List<?> list){
        //在内部进行遍历时，用Object即可，不用？
        for(Object a:list){
            System.out.println(a);
        }
        //数据的写入操作
        //list.add("abc");-->出错，不可以随便添加数据
        list.add(null);
        //数据的读取操作
        Object s = list.get(0);
    }
}
class T{
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Test t = new Test();
        t.a(new ArrayList<Integer>());
        t.a(new ArrayList<String>());
        t.a(new ArrayList<Object>());
    }
}