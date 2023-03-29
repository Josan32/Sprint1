package S1O3.N2EX1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int qualification;

    public Restaurant(String name, int qualification) {
        this.name = name;
        this.qualification = qualification;
    }

    public String getName() {
        return name;
    }

    public int getQualification() {
        return qualification;
    }


    @Override
    public boolean equals(Object o) {  // METODO EQUALS IMPLEMENTADOS DIRECTAMENTE
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;
        Restaurant that = (Restaurant) o;
        return getQualification() == that.getQualification() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getQualification());
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", qualification=" + qualification +
                '}';
    }

}
