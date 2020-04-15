package Java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间转换工具
 *
 * @author:Administrator
 * @create 2018-01-31 15:46
 */
public class DateUtils {

    // G 年代标志符
    //  y 年
    //  M 月
    //  d 日
    //  h 时 在上午或下午 (1~12)
    //  H 时 在一天中 (0~23)
    //  m 分
    //  s 秒
    //  S 毫秒
    //  E 星期
    //  D 一年中的第几天
    //  F 一月中第几个星期几
    //  w 一年中第几个星期
    //  W 一月中第几个星期
    //  a 上午 / 下午 标记符
    //  k 时 在一天中 (1~24)
    //  K 时 在上午或下午 (0~11)
    //  z 时区
    public static String formatMdW(Date date ){
        return format(date,"MM月dd日（E）");
    }

    public static  String formatYMd(Date date ){
        return format(date,"yyyy年MM月dd日");
    }

    public static String formatYM(Date date ){
        return format(date,"yyyy-MM");
    }

    public static String getDateByMinute(Integer number){
        return fullNum(number/60)+":"+fullNum(number%60);
    }

    private static String fullNum(Integer number){
        return (number<10?"0":"")+number;
    }

    /**
     * 获取当前时间 yyyyMMddHHmmss
     * @return String
     */
    public static String getCurrTime() {
        Date date  = new Date();
        return format(date,"MM-dd HH:mm:ss");
    }

    public static String getCurrTimeSerial() {
        Date date  = new Date();
        return format(date,"yyyyMMddHHmmss");
    }

    public static Integer getHm(Date date){
        String str = DateUtils.format(date,"HH:mm");
        return Integer.parseInt(str.split(":")[0])*60+Integer.parseInt(str.split(":")[1]);
    }

    public static String toHm(int date){
        return fullNum(date/60)+":"+fullNum(date%60);
    }

    public static synchronized String format(Date date ,String format){
        //用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
        if(date==null){
            return null;
        }else{
            SimpleDateFormat date1  = new SimpleDateFormat(format);
            String str =date1.format(date);
            return str;
        }
    }

    private static String fullNum(int num){
        return (num<10?"0":"")+num;
    }

    public static Boolean diffOneDay(Date date1 ,Date date2){
       return  new Date(date1.getTime()+24*3600000).getDate()==date2.getDate() && (date2.getTime()-date1.getTime()<48*3600000);
    }
    public static int between(Date date1 ,Date date2){
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000*3600*24));
        return days;

    }
    public static Boolean isSameDay(Date date1 ,Date date2){
        return date1.getDate()==date2.getDate() && (Math.abs(date2.getTime()-date1.getTime())<48*3600000);
    }
    public static Date getNextDay(){
        return new Date(System.currentTimeMillis()+24*3600000);
    }
    public static Date getLastDay(){
        return new Date(System.currentTimeMillis()-24*3600000);
    }
    public static Date tansf(String dates,String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            return sdf.parse(dates);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    public static Integer getLastDayByMonth(){
        LocalDate localDate = LocalDate.now();
        return localDate.lengthOfMonth();
    }
    public static Integer getLastDayByMonth(Date date){
        Instant instant = date.toInstant();
        ZoneId zone = ZoneId.systemDefault();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zone);
        LocalDate localDate = localDateTime.toLocalDate();
        return localDate.lengthOfMonth();
    }
    public static Boolean isLastDayOfMonth(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }
    public static Boolean isLastDayOfMonth(Date date){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.DATE, (calendar.get(Calendar.DATE) + 1));
        if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
            return true;
        }
        return false;
    }
    public static String maxDate(String time1,String time2){
        return (
                (Integer.parseInt(time1.split("-")[0])*12+Integer.parseInt(time1.split("-")[1])) -
                (Integer.parseInt(time2.split("-")[0])*12+Integer.parseInt(time2.split("-")[1]))
                ) > 0 ? time1: time2;
    }

    public static Boolean orderlyDate(String time1,String time2){
        String time  = DateUtils.maxDate(time1,time2);
        return time.equals(time2);
    }

    public static Long getTimeMillisFromDateToNow(Date date){
        return date.getTime()-System.currentTimeMillis();
    }

    public static String getNextMonth(String ym){
        String month = ym.split("-")[1];
        if("12".equalsIgnoreCase(month)){
            return (Integer.parseInt(ym.split("-")[0])+1)+"-01";
        }else{
            return ym.split("-")[0]+"-"+(Integer.parseInt(ym.split("-")[1])+1);
        }
    }

    public static Long divday(){
        Date now = new Date();
        return 24*3600L-(now.getHours()*3600+now.getMinutes()*60+now.getSeconds());
    }
}
