package N1EX1;

public class Worker {

    private String name;
    private String surname;
    private static int salaryHours;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salaryHours = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static int getSalary() {
        return salaryHours;
    }

    public Worker(String name, String surname, int salaryHours) {
        this.name = name;
        this.surname = surname;
        this.salaryHours = salaryHours;
    }

    public int calculateSalary(int numberHours){
        return numberHours * salaryHours;
    }
}
