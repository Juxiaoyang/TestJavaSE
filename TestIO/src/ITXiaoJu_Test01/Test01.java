package ITXiaoJu_Test01;

import java.io.File;
import java.io.IOException;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/6 - 04 - 06 - 11:55
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test01 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) throws IOException {
        //创建子类 的对象
        //将文件封装file类对象
        File f = new File("d:\\test.txt");
        File f1 = new File("d:/test.txt");
        //File.separator能帮我们获取当前系统的路径拼接符号
        File f2 = new File("d:"+File.separator+"test.txt");
        System.out.println("是否可读:"+f.canRead());//是否可读
        System.out.println("是否可写:"+f.canWrite());//是否可写
        System.out.println("文件名:"+f.getName());//文件名
        System.out.println("文件的上级目录:"+f.getParent());//文件的上级目录
        System.out.println("文件的大小:"+f.length());//文件的大小
        System.out.println("是否是一个目录:"+f.isDirectory());//是否是一个目录
        System.out.println("是否是一个文件:"+f.isFile());//是否文件
        System.out.println("是否存在:"+f.exists());//是否存在
        /*if(f.exists()){
            f.delete();
        }
        else{
            f.createNewFile();
        }*/
        System.out.println(f==f1);
        System.out.println(f.equals(f1));
        System.out.println("绝对路径："+f.getAbsolutePath());//真实路径
        System.out.println("相对路径："+f.getPath());//有一个参照物的相对路径
        System.out.println("toString:"+f.toString());
        System.out.println("--------------");
        File f3 = new File("demo.txt");
        if(!f3.exists()){
            f3.createNewFile();
        }
        System.out.println("绝对路径："+f3.getAbsolutePath());//真实路径
        System.out.println("相对路径："+f3.getPath());
        System.out.println("toString:"+f3.toString());
    }
}
