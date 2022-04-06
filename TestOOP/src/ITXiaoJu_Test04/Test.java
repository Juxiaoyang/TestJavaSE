package ITXiaoJu_Test04;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/10 - 02 - 10 - 16:39
 * @Description: ITXiaoJu_Test04
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(18);
        s1.setName("小鞠");
        s1.setSex("女");
        System.out.println(s1.getName()+"---"+s1.getSex()+"---"+s1.getAge());

        Student s2 = new Student("大奔","fbashbsbsja",19);
        System.out.println(s2.getName()+"---"+s2.getSex()+"---"+s2.getAge());
    }
}
