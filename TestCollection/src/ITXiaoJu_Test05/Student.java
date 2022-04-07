package ITXiaoJu_Test05;

import java.util.Comparator;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/25 - 03 - 25 - 16:06
 * @Description: ITXiaoJu_Test05
 * @version: 1.0
 */
public class Student implements Comparable<Student>{
    //比较器的使用
    private String name;
    private int age;
    private double height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        /*//按照身高进行比较
        return ((Double)this.getHeight()).compareTo((Double)o.getHeight());*/
       /* //按照年龄比较
        return this.getAge() - o.getAge();*/
        //按照姓名比较
        return (this.getName()).compareTo(o.getName());
    }
}
//外部比较器
class Bijiao implements Comparator<Student>{
    @Override
    //比较年龄
    public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
class Bijiao1 implements Comparator<Student>{
    @Override
    //比较姓名
    public int compare(Student o1, Student o2) {
        return (o1.getName()).compareTo(o2.getName());
    }
}
class Bijiao2 implements Comparator<Student>{
    @Override
    //如果年龄一样，比较身高
    public int compare(Student o1, Student o2) {
        if((o1.getAge() - o2.getAge())==0) {
            return ((Double)o1.getHeight()).compareTo((Double)o2.getHeight());
        }
        //如果年龄不一样，比较年龄
        else{
            return o1.getAge() - o2.getAge();
        }
    }
}