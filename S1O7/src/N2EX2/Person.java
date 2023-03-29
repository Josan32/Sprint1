package N2EX2;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    private String surname;

    public Person(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return  "The name is " + name + " "+ surname +" and have " + age + " years old";
    }
}
