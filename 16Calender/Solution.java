//https://www.hackerrank.com/challenges/java-date-and-time/problem
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static String getDay(String day, String month, String year) {
        DateFormatSymbols dfs = new DateFormatSymbols(Locale.US);
        String weekdays[] = dfs.getWeekdays();

        Calendar cal = new GregorianCalendar(Locale.US);
        cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

        String result = weekdays[cal.get(Calendar.DAY_OF_WEEK)].toUpperCase();
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        String month = scan.next();
        String year = scan.next();
        scan.close();
        System.out.println(getDay(day, month, year));

    }
}
