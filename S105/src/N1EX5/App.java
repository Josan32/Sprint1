package N1EX5;

import java.io.*;

public class App {
    public static void main(String[] args) {

        Person[] listPersons = new Person[2];  // CREAMOS UNA LISTA DEL TIPO PERSONA

        listPersons[0] = new Person("Jason", 35, "Anderson"); // INTRODUCIMOS LOS OBJETOS TIPO PERSON EN LA LISTA
        listPersons [1] = new Person("Phil", 57, "Sorgs");

        serializableDeserializable(listPersons);

    }
    public static void serializableDeserializable(Person[] listPersons){
        try{
            ObjectOutputStream writerFile = new ObjectOutputStream(new FileOutputStream("person.ser"));
            writerFile.writeObject(listPersons);
            writerFile.close();

            ObjectInput recoveringFile = new ObjectInputStream(new FileInputStream("person.ser"));
            Person[] recoveringPerson = (Person[]) recoveringFile.readObject();
            recoveringPerson.clone();

            for (Person p : recoveringPerson){
                System.out.println(p);
            }

        }catch (Exception e){

        }
    }
}
