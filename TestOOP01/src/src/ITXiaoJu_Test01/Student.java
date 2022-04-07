package src.ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/11 - 02 - 11 - 21:24
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Student extends Person {//子类student要继承父类person
    //特有属性
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    //方法
    public void study() {
        System.out.println("学生可以学习");
    }
}
