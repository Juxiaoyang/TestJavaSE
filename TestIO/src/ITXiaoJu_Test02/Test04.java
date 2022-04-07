package ITXiaoJu_Test02;

import java.io.*;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 21:36
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test04 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        File f1 = new File("E:\\Test\\test.jpg");
        File f2  =new File("E:\\Test\\test1.jpg");
        FileInputStream fis  =new FileInputStream(f1);
        FileOutputStream fos  =new FileOutputStream(f2,false);
        long startTime = System.currentTimeMillis();
        //开始复制
        int n = fis.read();
        while(n!=-1){
            fos.write(n);
            n = fis.read();//拿一个送一个
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制完成时间"+(endTime-startTime));
        fos.close();//先用先关
        fis.close();
    }
}
