package ITXiaoJu_Test01;

import org.omg.CORBA.Object;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/20 - 03 - 20 - 22:11
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class GenericTest02<A,B,C> {//泛型
    A age;
    B name;
    C Sex;
    public void a(A a,B b,C c){
        A i[] = (A[])new Object[10];
    }
    //构造器
    public GenericTest02(){

    }
}
