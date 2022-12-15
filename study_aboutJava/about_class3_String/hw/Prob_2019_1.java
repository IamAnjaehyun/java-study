package hw;

class APCalendar{
    private static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)){
            return true;
        }
        return false;
    }
    public static int numberOfLeapYears(int year1, int year2){
        int cnt=0;
        for(int i=year1;i<=year2;i++){
            if(isLeapYear(i))
                cnt++;
        }
        return cnt;
    }
    private static int firstDayOfYear(int year){
        return 3;// wednesday
    }

    private static int dayOfYear(int month, int day, int year){
        int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeapYear(year))
            days[2]=28;

        int cnt=0;
        for(int i=1;i<month;i++){
            cnt+=days[i];
        }
        cnt+=day;
        return cnt;
    }

    public static int dayOfWeek(int month, int day, int year){
        int startDay=firstDayOfYear(year);
        int nthDay=dayOfYear(month, day, year);
        int returnDay=(startDay+nthDay-1)%7;
        return returnDay;
    }
}

public class Prob_2019_1 {
    public static void main(String[] args) {
        System.out.println(APCalendar.numberOfLeapYears(2000,2020));
        System.out.println(APCalendar.dayOfWeek(1,1,2020));
    }
}