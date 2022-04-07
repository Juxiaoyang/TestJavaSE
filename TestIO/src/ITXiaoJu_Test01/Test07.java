package ITXiaoJu_Test01;

import java.io.*;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 15:28
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test07 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args)  {
        //创建子类 的对象
        //有一个源文件
        FileReader fr = null;
        FileWriter fw = null;
        try {
            File f1 = new File("D:\\test.txt");
            //有一个目标文件
            File f2 = new File("D:\\test1.txt");
            //搞一个输入的管，怼到源文件上
            fr = new FileReader(f1);
            //搞一个输出的管，怼到目标文件上
            fw = new FileWriter(f2);
            //开始操作
            //方式一：
        /*int n = fr.read();
        while(n!=-1){
            fw.write(n);
            n = fr.read();
        }*/
            //方式二：
        /*char chars[] = new char[5];
        int len = fr.read(chars);
        while(len!=-1){
            fw.write(chars,0,len);
            len = fr.read(chars);
        }*/
            //方式三：
            char chars[] = new char[5];
            int len = fr.read(chars);
            while (len != -1) {
                String s = new String(chars);//转成一个数组
                fw.write(s, 0, len);
                len = fr.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fw!=null){fw.close();//后用先关
                     }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr!=null) {
                    fr.close();//异常独自处理
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
