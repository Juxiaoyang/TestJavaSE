package ITXiaoJu_Test03;
//关于封装的示例
/**
 * @Auther: ITXiaoJu
 * @Date: 2022/2/10 - 02 - 10 - 14:57
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class Girl {
    //属性
    private int age;//私有的

    //读取年龄
    public int duquAge() {
        return age;
    }

    //设置年龄
    public void shezhiAge(int age) {
        if (age >= 30) {
            this.age = 18;
        } else {
            this.age = age;
        }
    }
}