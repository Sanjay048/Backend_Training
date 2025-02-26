/*Exercise 2: Serialize and Deserialize a Java Object
Steps:
Create a class that implements the Serializable interface.
Serialize the object to a file using ObjectOutputStream.
Deserialize the object from the file using ObjectInputStream.*/

package Day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeAndDeserialize {
    public static void main(String[] args) {
        SerializeAndDeserialize serializeAndDeserialize = new SerializeAndDeserialize();
        serializeAndDeserialize.doSer();
        serializeAndDeserialize.doDeSer();
    }
    public void doSer(){
        ObjectOutputStream objectOutputStream =null;
        try {
            Person person = new Person();
            person.name = "sanji";
            person.age = 21;
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("SerializeDeserialize.txt"));
            objectOutputStream.writeObject(person);
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (objectOutputStream!=null) objectOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public void doDeSer(){
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("SerializeDeserialize.txt"));
            Person person = (Person) objectInputStream.readObject();
            System.out.println("Name : "+person.getName());
            System.out.println("Age : `"+person.getAge());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                if (objectInputStream!=null) objectInputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
