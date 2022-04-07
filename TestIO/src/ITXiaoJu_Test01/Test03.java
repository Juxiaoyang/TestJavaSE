package ITXiaoJu_Test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/6 - 04 - 06 - 16:52
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test03 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        //把文件封装成对象
        File f = new File("D:\\test.txt");
        //把对象塞到吸管里
        FileReader fr = new FileReader(f);
        //开始吸
        /*int n = fr.read();//当读取完时，n的内容是-1
        while(n!=-1){
            System.out.print((char)n);
            n = fr.read();
        }*/
        int n;
        while((n=fr.read())!=-1){
            System.out.print((char)n);
        }
        fr.close();
    }
}
