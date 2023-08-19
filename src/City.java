import java.util.Comparator;
import java.util.Objects;

public class City {
    private int code;
    private String name;

    public Comparator<City> cityComparator = new Comparator<City>() {
        @Override
        public int compare(City o1, City o2) {
            return o2.getCode()-o1.getCode();
        }
    };

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return code == city.code && Objects.equals(name, city.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "City{" +
                "code : " + code +
                ", name : " + name + '\'' +
                '}';
    }
}
