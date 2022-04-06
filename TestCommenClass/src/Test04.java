import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/14 - 03 - 14 - 15:56
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test04 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //Calendar（日历） 是一个抽象类，不可以直接创建对象；
        //GregorianCalendar() extends Calender()
        Calendar cal = new GregorianCalendar();
        Calendar cal2 = Calendar.getInstance();
        System.out.println(cal2);
        //常用 用法
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));//周日第一天
       // System.out.println(cal.getActualMaximum(Calendar.DATE));

        cal.set(Calendar.YEAR,2022);
        cal.set(Calendar.MONTH,3);
        cal.set(Calendar.DATE,14);
        System.out.println(cal);


        java.sql.Date date = java.sql.Date.valueOf("2022-3-14");
        cal.setTime(date);
        System.out.println(cal);

    }
}
