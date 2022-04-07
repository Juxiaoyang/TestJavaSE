package src.ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/11 - 02 - 11 - 21:28
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */


public class Test {
    public static void main(String[] args) {
        //创建一个子类student的对象
        Student s = new Student();
        s.setSno(001);
        s.setAge(18);
        s.setName("小鞠");
        s.setHeight(162.5);
        System.out.println("学生姓名是：" + s.getName() + "，学生年龄是：" + s.getAge());

        //访问方法
        s.study();
        s.eat();
        s.sleep();
    }


}
