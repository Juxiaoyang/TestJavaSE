import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/15 - 03 - 15 - 11:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test06 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //完成实例化：
        //方法1 now();
        LocalDate lacalDate = LocalDate.now();//日期
        System.out.println(lacalDate);
        LocalTime localTime = LocalTime.now();//时间
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();//日期+时间
        System.out.println(localDateTime);
       /* //Local__.of( ),可设置指定时间日期
        LocalDate of=LocalDate.of(2022,3,15);
        LocalTime of1=LocalTime.of(16,49,2);
        System.out.println(of);
        System.out.println(of1);*/
        System.out.println(localDateTime.getYear());//get方法
        LocalDateTime localDateTime1 = localDateTime.withDayOfMonth(6);//重定义
        LocalDateTime localDateTime2 = localDateTime.plusMonths(6);//加
        LocalDateTime localDateTime3 = localDateTime.minusMonths(6);//减
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);
    }
}
