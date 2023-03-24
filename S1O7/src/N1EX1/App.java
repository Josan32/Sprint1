package N1EX1;

public class App {

    public static void main(String[] args) {

        OnlineWorker worker1 = new OnlineWorker("George", "Walker", 23);
        int salaryWorker1 = worker1.calculateSalary(40);
        System.out.println("The salary of the online worker is: " + salaryWorker1 + " $");

        OnSiteWorker worker2 = new OnSiteWorker("Philp", "Taylor", 23);
        int salaryWorker2 = worker2.calculateSalary(40);
        System.out.println("The salary of the on-site worker is: " + salaryWorker2 + "$");

        Worker worker3 = new Worker("Annie","Smith", 23);
        int salaryWorker3 = worker3.calculateSalary(40);
        System.out.println("The salary of the worker is: " + salaryWorker3 + "$");
    }
}
