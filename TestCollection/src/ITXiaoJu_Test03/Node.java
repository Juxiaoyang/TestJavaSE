package ITXiaoJu_Test03;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/22 - 03 - 22 - 17:48
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class Node {
    //三个属性
    private Node pre;//上一个元素
    private Object obj;//当前存入的元素
    private Node next;//下一个元素

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "pre=" + pre +
                ", obj=" + obj +
                ", next=" + next +
                '}';
    }
}
