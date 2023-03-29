package N1EX2;

public class OnSiteWorker extends Worker {

    private static int benzina = 50;

    public OnSiteWorker(String name, String surname, int salaryHours) {
        super(name, surname, salaryHours);

    }

    @Override
    public int calculateSalary(int numberHoursMonth){
        return (numberHoursMonth * Worker.getSalary()) + benzina;
    }
    @Deprecated
    public void metodeObsolet() {
        System.out.println("The metode is deprecat!!");
    }
}
