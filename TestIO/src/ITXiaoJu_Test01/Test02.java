package ITXiaoJu_Test01;

import java.io.File;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/4/6 - 04 - 06 - 15:34
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Test02 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //封装目录为对象
        File f = new File("E:\\源码\\IDEA_code");
        System.out.println("是否可读:"+f.canRead());//是否可读
        System.out.println("是否可写:"+f.canWrite());//是否可写
        System.out.println("文件名:"+f.getName());//文件名
        System.out.println("文件的上级目录:"+f.getParent());//文件的上级目录
        System.out.println("文件的大小:"+f.length());//文件的大小
        System.out.println("是否是一个目录:"+f.isDirectory());//是否是一个目录
        System.out.println("是否是一个文件:"+f.isFile());//是否文件
        System.out.println("是否存在:"+f.exists());//是否存在
        System.out.println("绝对路径："+f.getAbsolutePath());//真实路径
        System.out.println("相对路径："+f.getPath());//有一个参照物的相对路径
        System.out.println("toString:"+f.toString());

        File f2 =new File("E:\\a\\b\\c");
        //f2.mkdir();//创建单层目录
        f2.mkdirs();//创建多层目录
        f2.delete();//只删除最里面一层，且为空方可删
        String list[] = f.list();//查看目录
        for(String s :list){
            System.out.print(s+" ");
        }
        System.out.println("------------");
        File files[] = f.listFiles();//作用更加广泛
        for(File file :files){
            System.out.println(file.getName()+","+file.getAbsolutePath());
        }
    }
}
