public class Car
//        implements Comparable<Car>
{
    String name;
    int id;

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        return name.compareTo(o.name);
//    }

//    @Override
//    public int compareTo(Car o) {
//        return id - o.id;
//    }
}
