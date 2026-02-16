import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int firstCompare = o1.name.compareTo(o2.name);
        if (firstCompare == 0) {
            return o1.id - o2.id;
        }
        return firstCompare;
    }
}
