package src.ITXiaoJu_Test02;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/18 - 02 - 18 - 14:37
 * @Description: ITXiaoJu_Test02
 * @version: 1.0
 */
public class Student extends Person{
    double score;
    public Student(){
        //空构造器
    }
    public Student(double score,int age,String name)
    {
//        super.age = age;
//        super.name = name;
          super(age,name);//super调用构造器必须放第一行
          this.score = score;
    }
}
