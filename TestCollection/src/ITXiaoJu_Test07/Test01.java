package ITXiaoJu_Test07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 16:00
 * @Description: ITXiaoJu_Test07
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Map<String,Integer> map = new HashMap<>();
        map.put("lili",15111);
        map.put("lili1",15222);
        map.put("lili2",15333);
        map.put("lili",15444);
        map.put("lili4",15555);

        //map.remove("lili");
        //map.remove("lili",15444);
        System.out.println(map.size());
        System.out.println(map);//无序的,Key唯一
        System.out.println(map.containsKey("lili"));
        System.out.println(map.containsValue(15444));
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("lili",15111);
        map1.put("lili1",15222);
        map1.put("lili2",15333);
        map1.put("lili",15444);
        map1.put("lili4",15555);
        System.out.println(map==map1);//false 比较地址
        System.out.println(map.equals(map1));//true 比较具体的值是否一致
        System.out.println(map.isEmpty());
        //map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.get("lili1"));

        //遍历
        System.out.println("-------------------");
        Set<String> key = map.keySet();
        for(String s :key){
            System.out.println(s);
        }
        System.out.println("-------------------");
        Collection<Integer> values = map.values();
        for(Integer i :values){
            System.out.println(i);
        }
        System.out.println("-------------------");
        Set<String> key1 = map.keySet();
        for(String s :key1){
            System.out.println(map.get(s));
        }
        System.out.println("-------------------");
        //Set<Map.Entry<String,Integer>> entires = map.entrySet();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
    }
}
