package ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/1/27 - 01 - 27 - 16:00
 * @Description: ITXiaoJu_Test01
 * 创建类：人类
 * @version: 1.0
 */
public class Person {
    //名词-》属性！！！
    int age;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重

    //动词-》方法
    //吃饭
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
    //睡觉
    public void sleep(String address){
        System.out.println("我在"+address+"睡觉");
    }
    //自我介绍
    public String introduce(){
        return "我的名字是："+name+"，我的年龄是："+age+"，我的身高是："+height+"，我的体重是："+weight;
    }
}

