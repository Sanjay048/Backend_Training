package Day3;

interface Vehicles{
    void start();
}
interface FourWheeler extends Vehicles{
    void Wheels();
}
interface TwoWheeler extends Vehicles{
    void Fuel();
}

class cars implements FourWheeler{
    @Override
    public void start() {
        System.out.println("Car starts in key or button");
    }
    @Override
    public void Wheels() {
        System.out.println("Car has 4 wheels");
    }
}

class bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike starts in key or Kick start");
    }
    @Override
    public void Fuel() {
        System.out.println("Bike Runs in Petrol");
    }
}

public class InterfaceInheritance {

    public static void main(String[] args) {
        FourWheeler car = new cars();
        car.start();
        car.Wheels();
        TwoWheeler bike  = new bike();
        bike.start();
        bike.Fuel();
    }
}
