package ITXiaoJu_Test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 21:00
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //字节流读文件
        // 源文件
        File f = new File("C:\\Users\\ITXiaoJu\\Pictures\\Saved Pictures\\老婆1.jpg");
        //字节流怼到源文件
        FileInputStream fis = new FileInputStream(f);
        //文件是utf-8存储的
        //英文1字节，中文3字节
        int n =fis.read();
        int count = 0;//记录读入的字节个数
        while(n!=-1){
            System.out.println(n);
            n = fis.read();
            count++;
        }
        System.out.println("count="+count);
        fis.close();
    }
}
