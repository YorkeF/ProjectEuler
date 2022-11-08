/*
You are given the following information, but you may prefer to do some research for yourself.

    1 Jan 1900 was a Monday.
    Thirty days has September,
    April, June and November.
    All the rest have thirty-one,
    Saving February alone,
    Which has twenty-eight, rain or shine.
    And on leap years, twenty-nine.
    A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.

How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 */
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Problem19 {
    public static void main(String[] args) {
        int count = 0;
        for (int y = 1901; y < 2001; y++) {
            for (int m = 1; m < 13; m++) {
                for (int d = 1; d < 32; d++) {
                    if (isSunday(m,d,y) && d == 1){
                        count++;
                        System.out.println(count);
                    }else {
                        System.out.println(count);
                    }
                }
            }
        }
    }
    public static boolean isSunday(int month, int day, int year){
        try {
            LocalDate date = LocalDate.of(year, month, day);
            if (DayOfWeek.from(date).equals(DayOfWeek.SUNDAY)) {
                System.out.println("\n" + date);
                return true;
            } else {
                System.out.println("\n" + date);
                return false;
            }
        } catch (Exception e){
            return false;
        }
    }
}
