package ITXiaoJu_Test02;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/1/28 - 01 - 28 - 20:23
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Person {
    public Person(){//空参构造器
//        age = 22;
//        name = "小鞠";

    }
    public Person(String a,int b,double c,double d){
    age=age;
    name=name;
    height=height;
    weight=weight;
    }
    public Person(int age,String name,double weight,double height){
        this.age=age;
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
    //名词-》属性！！！
    int age;//年龄
    String name;//姓名
    double height;//身高
    double weight;//体重
    public void eat(){
        System.out.println("我喜欢吃饭");
    }
}
