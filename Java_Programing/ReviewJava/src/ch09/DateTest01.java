package ch09;

import java.util.Calendar;
import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        System.out.println("[ 현재 날짜와 시간-1 ]");
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println("");

        System.out.println("[ 현재 날짜와 시간-2 ]");
        Calendar currentDate = Calendar.getInstance();
        System.out.println(currentDate.toString());
    }
}
