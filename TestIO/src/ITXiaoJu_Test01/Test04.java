package ITXiaoJu_Test01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/6 - 04 - 06 - 19:03
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test04 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        File f = new File("D:\\test.txt");
        //把对象塞到吸管里
        FileReader fr = new FileReader(f);
        //一次性读5个
        char ch[] = new char[5];
        int len = fr.read(ch);//有效长度
        //System.out.println(len);
        while(len!=-1){
            //错误方式
            /*for (int i = 0; i <ch.length ; i++) {
                System.out.println(ch[i]);
            }*/
            //System.out.println(len);
            //正确方式1：
            /*for (int i = 0; i <len ; i++) {
                System.out.println(ch[i]);
            }*/
            //正确方式2：
            String str = new String(ch,0,len);
            System.out.println(str);
            len = fr.read(ch);//有效长度
        }

        fr.close();
    }
}

