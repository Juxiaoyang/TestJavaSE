import static java.lang.Math.*;//静态导入
/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/16 - 03 - 16 - 11:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test08 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //Math方法
        //常用属性
        System.out.println(PI);
        //常用方法
        System.out.println("随机数："+random());//100
        System.out.println("绝对值："+abs(-1));
        System.out.println("向上取值："+Math.ceil(9.1));//10.0
        System.out.println("向下取值："+Math.floor(9.9));//9.0

        //静态导入:可将math省略，import static java.lang.Math.*;
    }
    //若与math函数重名（random），优先使用方法
    public static int random(){
        return 100;
    }
}
