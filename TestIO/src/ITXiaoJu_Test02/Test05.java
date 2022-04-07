package ITXiaoJu_Test02;

import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/7 - 04 - 07 - 21:43
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        File f1 = new File("E:\\Test\\test.jpg");
        File f2  =new File("E:\\Test\\test2.jpg");
        FileInputStream fis  =new FileInputStream(f1);
        FileOutputStream fos  =new FileOutputStream(f2,false);
        //开始复制
        long startTime = System.currentTimeMillis();
        byte[] b = new byte[1024];
        int len = fis.read(b);
        while(len!=-1){
            fos.write(b,0,len);
            len = fis.read(b);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("复制完成时间"+(endTime-startTime));
        fos.close();//先用先关
        fis.close();
    }
}
