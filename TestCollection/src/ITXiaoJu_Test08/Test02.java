package ITXiaoJu_Test08;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 22:07
 * @Description: ITXiaoJu_Test08
 * @version: 1.0
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Map<Student,Integer> map = new TreeMap<>(new Comparator<Student>() {//外部比较器
            @Override
            public int compare(Student o1, Student o2) {
                return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
            }
        });
        //Integer lili = map.put(new Student(19, "lili", 170.0));
        map.put(new Student(19,"alili",150.0),21113);
        map.put(new Student(13,"blili",120.0),21383);
        map.put(new Student(11,"clili",140.0),21813);
        map.put(new Student(13,"dlili",163.0),21513);
        map.put(new Student(16,"elili",157.0),21313);
        System.out.println(map.size());
        System.out.println(map);//内部类排序方法

    }
}
