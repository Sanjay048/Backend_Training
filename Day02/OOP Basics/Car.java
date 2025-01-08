//Create a class Car with attributes like brand, model, and price. Write methods to display details of a car and calculate the discounted price.


package Day2;

public class Car {

    String carName;
    String carModel;
    double carPrice;
    double carDiscount;

    public Car(String carName, String carModel,double carPrice,double carDiscount){
        this.carName=carName;
        this.carModel=carModel;
        this.carPrice=carPrice;
        this.carDiscount=carDiscount;
    }

    public void displayCarDetails(){
        System.out.println("Car Name : "+carName);
        System.out.println("Car Model : "+carModel);
        System.out.println("Car Price : "+carPrice);
        System.out.println("Car Discount :"+discountPrice(carDiscount));
    }
    public double discountPrice(double discoutRate){
        if(discoutRate < 0 || discoutRate > 100){
            System.out.println("Invalid Discount");
            return carPrice;
        }
        return (carPrice*discoutRate)/100;
    }
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari","296 GTB",55000000.0,10.0);
        Car car2 = new Car("Porsche","Porsche 911",49000000.0,20.0);

        car1.displayCarDetails();
        car2.displayCarDetails();

    }
}
