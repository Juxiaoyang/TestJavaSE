package ITXiaoJu_Test02;

import com.sun.glass.ui.Size;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/22 - 03 - 22 - 11:15
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //LinkedList常用方法
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        list.add("bbb");
        System.out.println(list);//LinkedList可以添加重复元素
        list.addFirst("111");//添加元素在前端
        list.addLast("222");//添加元素在尾端
        System.out.println(list);//添加元素在尾端
        list.offer("kkk");//添加元素在尾端
        list.offerFirst("000");//添加元素在前端
        list.offerLast("ppp");//添加元素在尾端
        System.out.println(list);
        list.poll();//移除第一个元素
        list.pollFirst();//移除第一个元素
        list.pollLast();//移除最后一个元素
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        /*list.clear();
        System.out.println(list);*/
        //遍历
        System.out.println("----------------------");
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("----------");
        /*Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
        //节省内存
        for(Iterator/*<String>*/ it = list.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
