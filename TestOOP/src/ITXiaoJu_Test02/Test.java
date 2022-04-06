package ITXiaoJu_Test02;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/1/28 - 01 - 28 - 20:24
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建一个Person类的具体对象
        //1.第一次遇到Person时，进行类的加载（加载一次）
        //创建对象，在堆中开设空间
        //为对象进行属性的初始化动作
        /*
        new关键字实际上是在调用一个方法，：构造方法
        调用构造器，如果类中没有，系统会默认分配一个，自己看不到
        可以自己显式的自己将构造器编写出来：
        构造器格式：
        【修饰符】 构造器名字（）{
        }
        //没返回值，不能没return，名字特殊，必须和类名字一样
        构造器不是为了创建对象，而是给属性进行赋值操作；
        我们一般不会在空构造器中进行初始化操作，导致每个对象属性一样
         */
        Person P = new Person();
        P.eat();
    }
}
