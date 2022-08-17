import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cities> citiesList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Cities cities = new Cities(i, "city" + i);
            citiesList.add(cities);
        }
        for (Cities city : citiesList) {
            if (city.getCity_id() % 2 == 0) {
                Set<Cities> citiesSet = new HashSet<>();
                citiesSet.add(city);
                System.out.println(citiesSet);
            }
        }
        for (Cities cities : citiesList) {
          if (cities.getCity_id() % 2 != 0) {
              Set<Cities> citiesSet = new HashSet<>(Set.copyOf(citiesList));
              citiesSet.add(cities);
              System.out.println(citiesSet);
          }
        }
    }
}
