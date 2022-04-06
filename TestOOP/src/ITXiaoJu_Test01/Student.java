package ITXiaoJu_Test01;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/1/27 - 01 - 27 - 17:33
 * @Description: ITXiaoJu_Test01
 * @version: 1.0
 */
public class Student {
    int c=8888;//成员变量
    public void study(){
         int a;//局部变量，在方法中
        {
            int b;//局部变量，在代码块中
        }
        System.out.println(c);
    }
    public void eat(){
        System.out.println(c);
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.c);
    }
}


