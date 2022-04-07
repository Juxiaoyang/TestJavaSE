package ITXiaoJu_Test06;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 15:02
 * @Description: ITXiaoJu_Test06
 * @version: 1.0
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        /*Comparator<Student> com = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };*/
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        ts.add(new Student(10,"alili"));
        ts.add(new Student(4,"blili"));
        ts.add(new Student(5,"clili"));
        ts.add(new Student(15,"dlili"));
        ts.add(new Student(17,"elili"));
        System.out.println(ts.size());
        System.out.println(ts);
    }
}
