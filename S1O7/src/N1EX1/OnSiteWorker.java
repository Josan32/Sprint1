package N1EX1;

public class OnSiteWorker extends Worker{

    private static int benzina = 50;

    public OnSiteWorker(String name, String surname, int salaryHours) {
        super(name, surname, salaryHours);

    }

    @Override
    public int calculateSalary(int numberHoursMonth){
        return (numberHoursMonth * OnSiteWorker.getSalary()) + benzina;
    }
}
