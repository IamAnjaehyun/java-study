package hw;


public class APCalendar {
    private static boolean isLeapYear(int year)

    public static int numberOfLeapYears(int year1, int year2){
        int cnt = 0;
        for (int y=year1; y<=year2; y++) {
            if (isLeapYear(y))
                cnt++;
        }
        return cnt; 
    }

    private static int firstDayOfYear(int year)

    private static int dayOfYear(int month, int day, int year)

    public static int dayOfWeek(int month, int day, int year){
        int firstDay = firstDayOfYear(year);
        int doy = dayOfYear(month, day, year);
        return (firstDay + dayOfYear - 1) % 7;
    }
}
