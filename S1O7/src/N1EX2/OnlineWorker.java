package N1EX2;

public class OnlineWorker extends Worker {

    private final int priceInternet = 58;

    public OnlineWorker(String name, String surname, int salaryHours) {
        super(name, surname, salaryHours);

    }

    @Override
    public int calculateSalary(int numberHoursMonth){

        return (numberHoursMonth * Worker.getSalary()) + priceInternet;
    }

    @Deprecated
    public void metodeObsolet() {
        System.out.println("The metode is deprecat!!");
    }

}
