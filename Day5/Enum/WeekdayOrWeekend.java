//Write a program to print a message like "It's a weekday" or "It's a weekend" based on the day.

package Day5;

public class WeekdayOrWeekend {
    public enum Day{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static String checkDay(Day day){
        switch (day){
            case SATURDAY:
            case SUNDAY:
                return "It is WeekEnd";
            default:
                return "It is WeekDay";
        }
    }
    public static void main(String[] args) {
        Day today1 = Day.MONDAY;
        System.out.println(today1+checkDay(today1));

        Day today2 = Day.SATURDAY;
        System.out.println(today2+checkDay(today2));
    }
}
