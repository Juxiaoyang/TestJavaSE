package ITXiaoJu_Test02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 21:03
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        //字节流读文件
        // 源文件
        File f = new File("C:\\Users\\ITXiaoJu\\Pictures\\Saved Pictures\\老婆1.jpg");
        //字节流怼到源文件
        FileInputStream fis = new FileInputStream(f);
        //文件是utf-8存储的
        //缓冲数组
        byte bt[] = new byte[1024*10];
        int len = fis.read(bt);
        int count =0;
        while(len!=-1){
            for (int i = 0; i <len ; i++) {
                System.out.println(bt[i]);
                count++;
            }
            len = fis.read(bt);
        }
        System.out.println("count="+count);
        fis.close();
    }
}
