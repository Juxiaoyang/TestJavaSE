package ITXiaoJu_Test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 17:41
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //字节流读文件
        // 源文件
        File f = new File("D:\\test.txt");
        //字节流怼到源文件
        FileInputStream fis = new FileInputStream(f);
        //文件是utf-8存储的
        //英文1字节，中文3字节
        int n =fis.read();
        int t = 0;
        while(n!=-1){
            System.out.println(n);
            n = fis.read();
            t++;
        }
        System.out.println(t);
        fis.close();
    }
}
