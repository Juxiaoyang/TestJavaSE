package ITXiaoJu_Test04;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/10 - 02 - 10 - 16:34
 * @Description: ITXiaoJu_Test04
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;
    private String sex;



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if("男".equals(sex)||"女".equals(sex)){
            this.sex = sex;
        }
        else{
            this.sex ="男";
        }

    }
    public  Student(){

    }
    public Student(String name, String sex,int age){
        this.age = age;
        this.name = name;
        //this.sex = sex;
        this.setSex(sex);//构造器需要重新调用一下
    }
}
