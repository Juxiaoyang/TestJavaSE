package ITXiaoJu_Test05;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/3 - 03 - 03 - 21:19
 * @Description: ITXiaoJu_Test05
 * 1.类和接口是一个层次的概念
 * 2.接口没构造器
 * 3.类实现接口
 * @version: 1.0
 */
public interface TestInterface01 {
    //常量
    public static final int NUM = 10;

    //抽象方法
    public abstract void a();
}

interface TestInterface02 {
    public abstract void b();
}

class Student extends Person implements TestInterface01, TestInterface02 {
    @Override
    public void a() {//重写
        System.out.println("I am a...");
    }

    @Override
    public void b() {
        System.out.println("I am b...");
    }
}

class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //接口不能创建对象
        TestInterface01 t = new Student();
        t.a();
        System.out.println(TestInterface01.NUM);
        Student s = new Student();
        s.b();
    }
}