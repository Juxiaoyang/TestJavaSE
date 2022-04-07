import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: ITXiaoJu
 * @Date: 2022/3/13 - 03 - 13 - 21:48
 * @Description: PACKAGE_NAME
 * @version: 1.0
 */
public class Test03 {
    //这是一个main方法，是程序的入口
    public static void main(String[] args) {
        //日期转换
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        //SimpleDateFormat extends DateFormat
        //格式化标准定义好 String--->Date;
        try{
            System.out.println(df.parse("2022.3.13 21:54:8"));
            Date d = df.parse("2022.3.13 21:54:8");
            System.out.println(d);
        }catch(ParseException e){
            e.printStackTrace();
        }
        String format = df.format(new Date());
        System.out.println(format);
        Date date = new Date();
        System.out.println(date.toString());

    }
}
