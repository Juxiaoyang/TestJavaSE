package ITXiaoJu_Test08;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 22:03
 * @Description: ITXiaoJu_Test08
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        Map<String,Integer> map = new TreeMap<>();
        map.put("alilili",3213);
        map.put("blilili",2424);
        map.put("clilili",5252);
        map.put("dlilili",4241);
        map.put("elilili",1414);
        map.put("flilili",1414);
        System.out.println(map.size());
        System.out.println(map);//key升序排列
    }
}
