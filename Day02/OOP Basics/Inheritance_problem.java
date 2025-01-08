//Create a class Animal with a method speak(). Derive classes Dog and Cat and override the speak() method to display appropriate sounds.

package Day2;

class Animal{
    public void speak(){
            System.out.print("Animal sound");
    }
}
class dog extends Animal{
    public void speak(){
        System.out.println("The Dog Barks");
    }
}
class cat extends Animal{
    public void speak(){
        System.out.println("The Cat Meow");
    }
}
public class Inheritance_problem {

    public static void main(String[] args) {
        Animal dogs = new dog();
        Animal cats = new cat();

        dogs.speak();
        cats.speak();
    }
}

