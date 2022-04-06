package ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/20 - 03 - 20 - 22:24
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 * 不是带泛型的方法就是泛型方法
 * 这个方法的泛型要和当前类的泛型无关
 */
public class GenericTest03<E> {
    //不是泛型方法
    public void b(E b){

    }
    //是泛型方法
    public static <T> void c(T c){//与E无关

    }
}
class Demo{
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        GenericTest03<String> gt = new GenericTest03<>();
        gt.c("aas");
        gt.c(1.2);
        gt.c(new String[]{"a"});
    }


}