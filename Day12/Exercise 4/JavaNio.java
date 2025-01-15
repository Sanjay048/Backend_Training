//Using any two buffers for Reading and Writing Data

package Day12;

import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class JavaNio {
    public static void main(String[] args) {
        CharBuffer charBuffer = CharBuffer.allocate(10);
        IntBuffer intBuffer = IntBuffer.allocate(10);
        String text = "sanjay";
        int[] number = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < text.length(); i++) {
            charBuffer.put(text.charAt(i));
        }
        charBuffer.flip();
        for (int i = 0; i < number.length; i++) {
            intBuffer.put(number[i]);
        }
        intBuffer.flip();
        System.out.print("CharBuffer : ");
        while (charBuffer.hasRemaining()){
            System.out.print(charBuffer.get());
        }
        System.out.print("\nIntBuffer : ");
        while (intBuffer.hasRemaining()){
            System.out.print(intBuffer.get());
        }
        System.out.println("\nIntBuffer Limit : "+intBuffer.limit()+"\nCharBuffer Limit : "+charBuffer.limit());
    }
}
