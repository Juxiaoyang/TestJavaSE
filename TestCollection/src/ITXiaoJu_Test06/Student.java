package ITXiaoJu_Test06;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/26 - 03 - 26 - 14:59
 * @Description: ITXiaoJu_Test06
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
        private int age;
        private String name;

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

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();
    }
}

