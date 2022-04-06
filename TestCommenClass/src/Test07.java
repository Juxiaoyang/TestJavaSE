import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/15 - 03 - 15 - 19:57
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test07 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //实现LocalDate,LocalTime,LocalDateTime-->String类型
        //1.预定义的标准格式
        //DateTimeFormatter格式化
        DateTimeFormatter df1 = DateTimeFormatter.ISO_DATE_TIME;
        LocalDateTime now = LocalDateTime.now();//now为当前日期
        //now(LocalDatetime)-->String
        String str = df1.format(now);
        System.out.println(str);//2022-03-15T20:11:36.394
        //String-->LocalDateTime
        TemporalAccessor parse1 = df1.parse("2022-03-15T20:11:36.394");
        System.out.println(parse1);
        //{},ISO resolved to 2022-03-15T20:11:36.394
        //2.本地化相关格式
        //DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);//22-3-15 下午11:21
        //DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);//2022-3-15 23:17:20
        DateTimeFormatter df2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);//2022年3月15日 下午11时21分57秒
        //System.out.println(df2);
        //LocalDatetime-->String
        LocalDateTime now1 = LocalDateTime.now();//now1为当前日期
        String str2 = df2.format(now1);
        System.out.println(str2);
        //3.自定义模板
        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //LocalDatetime-->String
        LocalDateTime now3 = LocalDateTime.now();
        String str3 = df3.format(now3);
        System.out.println(str3);
        //String-->LocalDateTime
        TemporalAccessor parse2 = df3.parse("2022-03-15 23:58:03");
        System.out.println(parse2);

    }
}
