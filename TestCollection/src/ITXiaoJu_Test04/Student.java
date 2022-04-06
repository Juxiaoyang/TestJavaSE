package ITXiaoJu_Test04;

import java.util.Objects;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/24 - 03 - 24 - 15:14
 * @Description: ITXiaoJu_Test_04
 * @version: 1.0
 */
public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                name.equals(student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
