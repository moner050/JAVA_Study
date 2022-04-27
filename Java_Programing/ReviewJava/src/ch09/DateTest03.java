package ch09;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest03 {
    public static void main(String[] args) {
        System.out.println("[ 현재 날짜와 시간 ]");
        Calendar currentDate = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일 E요일 HH시 mm분 ss초");
        System.out.println(dateFormat.format(currentDate.getTime()));
    }
}
