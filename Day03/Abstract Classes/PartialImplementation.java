/*Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract). 
Derive a class Fan and implement turnOn().*/

package Day3;
abstract class Appliance{
    abstract void turnOn();

    public void turnOf() {
        System.out.println("Turned off");
    }
}
class Fan extends Appliance{
    @Override
    void turnOn() {
        System.out.println("Fan turned On");
    }
}
public class PartialImplementation {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOf();
    }
}
