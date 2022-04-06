/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/8 - 03 - 08 - 22:01
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        /*2147483647
         -2147483648*/
        //物极必反
        System.out.println(Integer.MAX_VALUE+1);
        System.out.println(Integer.MIN_VALUE-1);
        /*-2147483648
        2147483647*/
    }
}
