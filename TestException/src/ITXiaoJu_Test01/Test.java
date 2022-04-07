package ITXiaoJu_Test01;

import java.util.Scanner;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/5 - 03 - 05 - 18:12
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //实现键盘录入
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个数：");
            int num1 = sc.nextInt();
            System.out.println("请输入第二个数：");
            int num2 = sc.nextInt();//int类型的数；且num2 不能为0；
            System.out.println("商：" + num1 / num2);
            return;
        } catch (Exception ex) {
            /*System.out.println(ex.getMessage());
            ex.printStackTrace();*/
            //throw ex;//抛出异常；
        } finally {//优先级很高，只有System.exit(1);可以中断；
            System.out.println("啦啦啦");
        }
    }
}