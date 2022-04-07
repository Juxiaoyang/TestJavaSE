package ITXiaoJu_Test01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 15:23
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test06 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        File f = new File("D:\\test1.txt");
        /* 把对象塞到吸管里 */
        //FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter(f,false);//只覆盖，不追加,true反之
        String str = "黄晓凡，老公爱你。";
        char chars[] = str.toCharArray();
        fw.write(chars);
        fw.close();
    }
}
