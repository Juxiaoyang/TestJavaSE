package ITXiaoJu_Test03;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/22 - 03 - 22 - 17:50
 * @Description: ITXiaoJu_Test03
 * @version: 1.0
 */
public class MyLinkedList {
    //链中一定有一个首节点和尾结点
    Node first;
    Node last;
    //计数器
    int count = 0;
    //提供一个构造器
    public MyLinkedList(){

    }
    //添加元素的方法
    public void add(Object o){
        if(first == null){//证明添加元素为第一个节点
            //将添加元素，封装为Node对象
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            //此时就一个元素，当前链第一个节点为 n，最后一个节点也为 n
            first = n;
            last = n;
        }else{//证明已经不是链中第一个节点了
            //将添加元素，封装为Node对象
            Node n = new Node();
            n.setPre(last);//n的上一个节点，一定是上一个的最后一个节点last
            n.setObj(o);
            n.setNext(null);
            //当前链中的最后一个节点的下一个元素，要指向n
            last.setNext(n);
            last = n;
        }
        count++;
    }
    //得到集合中元素数量
    public int getsize(){
        return count;
    }
    //通过下标得到元素
    public Object get(int index){
        //获取链表头元素
        Node n = first;
        for (int i = 0; i < index; i++) {
            n=n.getNext();
        }
        return n.getObj();//中间元素
    }
}
class Test{
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        MyLinkedList ml = new MyLinkedList();
        ml.add("aa");
        ml.add("bb");
        ml.add("cc");
        System.out.println(ml.getsize());
        System.out.println(ml.get(2));
    }
}