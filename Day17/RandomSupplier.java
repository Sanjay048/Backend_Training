//Random Supplier Create a Supplier that generates a random number between 1 and 100 and prints it 5 times.

package Day17;

import java.util.Random;
import java.util.function.Supplier;

public class RandomSupplier {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomSupplier = ()-> 1+random.nextInt(100);
        for (int i = 0; i < 5; i++) {
            System.out.println(randomSupplier.get());
        }
    }
}
