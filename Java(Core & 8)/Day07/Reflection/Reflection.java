/*Write a Java program to demonstrate the use of reflection. Your program should:
Dynamically load a custom class (e.g., Person) using its fully qualified name.
Display the following details about the class:
All declared methods and their return types.
All declared fields and their types.
All constructors.
Dynamically invoke a method on an object of the class, provided the method name and arguments as input.*/

package Day7;

import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) {
        try
        {
            System.out.println("Display Constructor");
            Class aClass = Class.forName("Day7.Person");
            Constructor[] constructors = aClass.getDeclaredConstructors();
            for (int i = 0; i < constructors.length; i++) {
                System.out.println(constructors[i]);
            }
            Person pr = (Person) constructors[1].newInstance("sanji",21);
//            System.out.println(pr);

            System.out.println("\nDisplay Methods");
            Method[] methods = aClass.getDeclaredMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i]);
            }

            System.out.println("\nDisplay Fileds");
            Field[] fields = aClass.getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(fields[i]);
            }

            System.out.println("\nInvoking displayDetails method");
            Method[] method = aClass.getMethods();
            for (int i = 0; i < method.length; i++) {
                if (method[i].getName().contains("display")){
                    method[i].invoke(pr);
                }
            }
        }catch (Exception e){

        }
    }
}
