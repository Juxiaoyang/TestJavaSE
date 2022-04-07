import java.lang.Object;
import java.util.Arrays;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/18 - 03 - 18 - 10:30
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test11 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        //public StringBuilder() {
        //        super(16);//默认为16
        //    }
        StringBuilder sb1 = new StringBuilder(3);
        //底层value = new char[capacity];3为自定义长度
        StringBuilder sb2 = new StringBuilder("abc");
        //分为value(值),length;
        sb2.append("def");
        System.out.println(sb2);
        sb.append("def").append("ghi");//链式调用方法return this;
        /*if (minimumCapacity - value.length > 0) {
            value = Arrays.copyOf(value,
                    newCapacity(minimumCapacity));
        }*/
        //16+3=19个字符空间，若满了最终执行扩容19*2+2=40个空间
        System.out.println(sb);

    }
}
