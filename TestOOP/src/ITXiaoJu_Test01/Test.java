package ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/1/27 - 01 - 27 - 16:13
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个人类的具体对象
        //创建一个对象，名为oy
        //person属于 引用数据类型
        Person oy=new Person();
        oy.name = "欧阳";
        oy.height=175.0;
        oy.age = 21;
        oy.weight = 125.0;
        System.out.println(oy.name);
        oy.eat();
        oy.sleep("教室");
        System.out.println(oy.introduce());
    }
}
