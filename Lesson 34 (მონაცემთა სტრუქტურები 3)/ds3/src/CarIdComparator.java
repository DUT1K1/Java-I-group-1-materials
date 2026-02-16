import java.util.Comparator;

public class CarIdComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
//        return -(o1.id - o2.id);
        return o2.id - o1.id;
    }
}
