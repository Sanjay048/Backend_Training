/*Create a generic class Pair<K, V> to hold a key-value pair.
Write a program to store and display pairs of different data types, like <String, Integer> or <Integer, String>.*/

package Day5;

public class PairExample {
    public static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void display() {
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Age", 25);
        pair1.display();
    }
}
