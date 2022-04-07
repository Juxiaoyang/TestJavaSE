package ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/20 - 03 - 20 - 21:43
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class GenericTest01<E> {//<E>不确定
    int age;
    E sex;

    public void b(E b) {

    }
    public void a(E[] a) {

    }
}
class SubGenericTest extends GenericTest01<Integer>{
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //指定父类泛型，子类继承时就不需要再指定泛型，可以直接使用
        SubGenericTest sgt = new SubGenericTest();
        sgt.b(12);
    }
}
class Test{
        //这是一个main方法，是程序的入口
        public static void main(String[] args) {
            //创建子类 的对象
            GenericTest01 gt = new GenericTest01();
            gt.b("abc");
            gt.b(1);
            gt.b(9.8);
            gt.a(new String[]{"a","b","c"});

            GenericTest01<String> gt1 = new GenericTest01<>();
            gt1.b("a");
            gt1.sex = "男";
            gt1.a(new String[]{"a"});
        }
    }

