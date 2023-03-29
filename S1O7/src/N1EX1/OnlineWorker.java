package N1EX1;

public class OnlineWorker extends Worker{

    private final int priceInternet = 58;

    public OnlineWorker(String name, String surname, int salaryHours) {
        super(name, surname, salaryHours);

    }

    @Override
    public int calculateSalary(int numberHoursMonth){
       return (numberHoursMonth * OnlineWorker.getSalary()) + priceInternet;
    }

}
