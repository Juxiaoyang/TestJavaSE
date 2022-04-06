package src.ITXiaoJu_Test03;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/18 - 02 - 18 - 17:56
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Student() {
    }

    public Student(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }
   /* public String  toString(){//对toString代码进行重写
        return "这是一个student对象，名字是："+name+",年龄："+age+"，身高："+height;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
