/*Create a base class Animal with a method sound(). 
Derive two classes Dog and Cat from Animal. 
Override the sound() method to print “Bark” for Dog and “Meow” for Cat. */


package Day3;

class Animal{
    public void sound(){
        System.out.print("Animal sound");
    }
}
class dog extends Animal{
    public void sound(){
        System.out.println("The Dog Barks");
    }
}
class cat extends Animal{
    public void sound(){
        System.out.println("The Cat Meow");
    }
}
public class HierarchicalInheritance {

    public static void main(String[] args) {
        Animal dogs = new dog();
        Animal cats = new cat();

        dogs.sound();
        cats.sound();
    }
}


