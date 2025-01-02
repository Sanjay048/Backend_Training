/*Create an enum Season with values WINTER, SPRING, SUMMER, and FALL.
Add a method getAverageTemperature() to return an average temperature for each season.*/

package Day5;

public class SeasonExample {
    public enum Season{
        WINTER(5.0),
        SPRING(10.0),
        SUMMER(15.0),
        FALL(7.0);

        private final double averageTemperature;

        Season(double averageTemperature){
            this.averageTemperature=averageTemperature;
        }
        public double getAverageTemperature() {
            return averageTemperature;
        }
    }

    public static void main(String[] args) {
        for (Season season : Season.values()){
            System.out.println(season+" Average Temperature : "+season.getAverageTemperature()+" C");

        }
    }
}
