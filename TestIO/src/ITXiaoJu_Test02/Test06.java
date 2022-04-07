package ITXiaoJu_Test02;

import java.io.*;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 22:01
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        File f1 = new File("E:\\Test\\test.jpg");
        File f2  =new File("E:\\Test\\test3.jpg");
        FileInputStream fis  =new FileInputStream(f1);
        FileOutputStream fos  =new FileOutputStream(f2,false);
        //功能加强,再套一个管
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long startTime = System.currentTimeMillis();
        byte b[] = new byte[1024];
        int len = bis.read(b);//吸操作，返回值int类型
        while (len!=-1){
            bos.write(b,0,len);
            len = bis.read(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制完成时间"+(endTime-startTime));
        //一般处理流包裹字符流，关掉高级流，低级流也会被关闭
        bos.close();//先用先关
        bis.close();
    }
}
