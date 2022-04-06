import sun.font.FontRunIterator;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/14 - 03 - 14 - 16:27
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test05 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //创建子类 的对象
        //String --->Calender;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期，请按照XXXX-XX-XX格式书写：");
        String strDate = sc.next();
        //System.out.println(strDate);//测试是否录入成功 √
        //String--->Date;
        java.sql.Date date = java.sql.Date.valueOf(strDate);//1
        //Date--->Calender;
        Calendar cal = new GregorianCalendar();
        //Calendar cal = Calendar.getInstance();
        cal.setTime(date);//2
        //System.out.println(cal);
        //后续操作：
        //星期提示：
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        //获取本月最大天数
        int maxDay = cal.getActualMaximum(Calendar.DATE);
        int nowDay = cal.get(Calendar.DATE);//几号
        int firstDay = cal.get(Calendar.DAY_OF_WEEK);//一周第几天，周日为第一天
        // eg: 当日14号 周一，x=14 y=2 那么y-(x%7)便是月初第一天的星期数
        int s = firstDay - ((nowDay) % 7);//y-(x%7)便是月初第一天的星期数
        /*System.out.println(nowDay);
        System.out.println(firstDay);*/
        //System.out.println(s);
        //然后开始遍历：
        int count = s;//计数器
        for (int i = 0; i < s; i++) {
            System.out.print(" " + "\t");//打印月初空格
        }
        for (int i = 1; i <= maxDay; i++) {
            if (i == nowDay) {//判断是否为当日
                System.out.print(i + "*" + "\t");
            } else {
                System.out.print(i + "\t");
            }
            count++;//计数器
            if (count % 7 == 0) {//七次一换行
                System.out.println();
            }
        }
    }
}
