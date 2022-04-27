package ch09;

import java.util.Calendar;

public class DateTest02 {
    public static void main(String[] args) {

        System.out.println("[ 현재 날짜와 시간 ]");
        Calendar currentDate = Calendar.getInstance();

        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1;
        int day = currentDate.get(Calendar.DAY_OF_MONTH);

        int week = currentDate.get(Calendar.DAY_OF_WEEK);
        String strWeek = null;
        switch (week)
        {
            case Calendar.MONDAY : strWeek = "월"; break;
            case Calendar.TUESDAY : strWeek = "화"; break;
            case Calendar.WEDNESDAY : strWeek = "수"; break;
            case Calendar.THURSDAY : strWeek = "목"; break;
            case Calendar.FRIDAY : strWeek = "금"; break;
            case Calendar.SATURDAY : strWeek = "토"; break;
            default : strWeek = "월";
        }

        int amPm = currentDate.get(Calendar.AM_PM);
        String strAmPm = null;

        if(amPm == Calendar.AM) strAmPm = "오전";
        else strAmPm = "오후";

        int hour = currentDate.get(Calendar.HOUR);
        int minute = currentDate.get(Calendar.MINUTE);
        int second = currentDate.get(Calendar.SECOND);

        System.out.println(
                        year + "년 "
                        + month + "월 "
                        + day + "일 "
                        + strWeek + "요일 " + strAmPm + " "
                        + hour + "시 "
                        + minute + "분 "
                        + second + "초");
    }
}
