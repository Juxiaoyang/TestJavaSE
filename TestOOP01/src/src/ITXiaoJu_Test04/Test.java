package src.ITXiaoJu_Test04;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/26 - 02 - 26 - 14:36
 * @Description: ITXiaoJu_Test04
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Phone P1 = new Phone("荣耀20Pro", 3199.99, 2020);
        Phone P2 = new Phone("荣耀20Pro", 3199.99, 2020);
        System.out.println(P1.equals(P2));
        boolean flag = P1.equals(P2);
        System.out.println(flag);
        System.out.println(P1 == P2);
       /* System.out.println(P1);
        System.out.println(P2);*/
        Cat cat = new Cat();
        System.out.println(P1.equals(cat));
    }
}
