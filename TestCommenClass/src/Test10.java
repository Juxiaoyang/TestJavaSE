import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/16 - 03 - 16 - 15:41
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test10 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //声明变量String类型
        String str = "ABC";
        System.out.println(str);
        //使用构造器创建对象
        String str1 = "";
        String s1 = new  String("abc");
        System.out.println(s1 );
        String s2 = new String(new char[]{'a','b','c'});
        System.out.println(s2);
        System.out.println(str.length());
        String s5 = new String();
        System.out.println("字符串是否为空"+s5.isEmpty());
        String s6 = new String("abcdefghi");
        String s7 = new String("abcdefg");
        System.out.println("字符串对应下标字符为+"+s6.charAt(1));
        boolean bool = s6.equals(s7);//equals返回的是boolean类型的数值
        System.out.println(bool);
        int i= s6.compareTo(s7);
        System.out.println(i);
        String s8 = new String("abcdefghijk");
        System.out.println(s8.substring(3));
        System.out.println(s8.substring(3,6));
        System.out.println(s8.substring(3,6).concat("ghi"));
        String s9 = new String("abc");
        System.out.println(s9.replace('a','e'));//替换
        System.out.println(s9.toUpperCase());
        System.out.println(s9.toUpperCase().toLowerCase());
        String s10 = new String("  a b c  ");
        System.out.println(s10.trim());
        System.out.println(s10.toString());
        //转换为String类型;
        System.out.println(String.valueOf(s10));

    }
}