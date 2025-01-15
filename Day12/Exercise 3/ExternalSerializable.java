/*Exercise 3: External Serializable a Java Object
Steps:
writeExternal(ObjectOutput out) for writing object data.
readExternal(ObjectInput in) for reading object data.*/

package Day12;

import java.io.*;

public class ExternalSerializable {
    public static void main(String[] args) {
        ExternalSerializable externalSerializable = new ExternalSerializable();
        externalSerializable.doSer();
        externalSerializable.doDoSer();
    }

    public void doSer() {
        ObjectOutputStream objectOutputStream = null;
        try {
            PersonExternalSerialization personExternalSerialization = new PersonExternalSerialization();
            personExternalSerialization.name = "Sanji";
            personExternalSerialization.age = 21;
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("ExternalSerializable.txt"));
            objectOutputStream.writeObject(personExternalSerialization);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void doDoSer() {
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("ExternalSerializable.txt"));
            PersonExternalSerialization externalSerialization = (PersonExternalSerialization) objectInputStream.readObject();
            System.out.println("Name : " + externalSerialization.getName());
            System.out.println("Age : " + externalSerialization.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
