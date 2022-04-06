import java.util.Random;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/16 - 03 - 16 - 13:07
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test09 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        System.out.println(Math.random());//随机数
        //学习random类
        //(1)带参构造器
        Random r1 = new Random(System.currentTimeMillis());//传入一个Long类型的数
        int i1 = r1.nextInt();//int范围的随机数
        System.out.println(i1);
        //(2)利用空参构造器创建对象
        Random r2 = new Random();
        System.out.println(r2.nextInt(10));//0~x内产生一个随机数
        System.out.println(r2.nextDouble());
    }
}
