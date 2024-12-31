package Day3;

interface Animals{
    void eat();
    void sleep();
}
class Dogs implements Animals {
    @Override
    public void eat() {
        System.out.println("Dog eats Pedigree");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in Doghouse");
    }
}

class Cats implements Animals {
    @Override
    public void eat() {
        System.out.println("Cat eats Fish");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps in House");
    }
}

public class BasicInterface {
    public static void main(String[] args) {
        Animals dog = new Dogs();
        Animals cat = new Cats();

        dog.eat();
        dog.sleep();
        cat.eat();
        cat.sleep();
    }
}
