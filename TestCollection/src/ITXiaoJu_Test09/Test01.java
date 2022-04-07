package ITXiaoJu_Test09;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/3 - 04 - 03 - 15:34
 * @Description: ITXiaoJu_Test09
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //不支持创建对象，构造器私有化了
        //里面的属性和方法都被static修饰，可以直接类名.方法调用
        /*Collections col = new Collections();*/
        ArrayList<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        Collections.addAll(arr,"ddd","eee","fff");
        Collections.addAll(arr,new String[]{"aaa","bbb","ccc"});
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(Collections.binarySearch(arr, "ccc"));//必须在有序的集合下使用
        ArrayList<String> arr2 = new ArrayList<>();
        Collections.addAll(arr2,new String[]{"aaa","bbb","ccc","ddd"});
        Collections.addAll(arr2,"ddd","eee","fff","ggg","hhh");
        //Collections.copy(arr,arr2);
        //Collections.copy(arr2,arr);copy(a,b)a>=b才可以，否则报错；
        System.out.println(arr);
        System.out.println(arr2);
        Collections.fill(arr2,"ooo");//填充为全是ooo
        System.out.println(arr2);

    }
}
