//Define an enum Day with values for all days of the week.

package Day5;

public class EnumExample {
    public enum Day{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
    public static void main(String[] args) {
        for (Day day : Day.values()){
            System.out.println(day);
        }
    }
}
