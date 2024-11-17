package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExmaple {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm a");

        String strNow2 = sdf.format(now);
        String strNow3 = sdf1.format(now);

        System.out.println(strNow2);
        System.out.println(strNow3);
    }
}
