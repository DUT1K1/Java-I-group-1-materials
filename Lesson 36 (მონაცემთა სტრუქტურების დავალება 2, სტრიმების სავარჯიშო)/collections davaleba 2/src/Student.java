import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student>{
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> scores;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.scores = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashMap<String, ArrayList<Integer>> getScores() {
        return scores;
    }

    public void setScores(HashMap<String, ArrayList<Integer>> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", scores=" + scores +
                '}';
    }

    public void addScore(String subject, int score) {
        scores.putIfAbsent(subject, new ArrayList<>());
        scores.get(subject).add(score);
    }

    public double getOverallAverageScore() {
        int total = 0;
        int count = 0;
        for (ArrayList<Integer> l : scores.values()) {
            for (int i : l) {
                count++;
                total += i;
            }
        }
        return count == 0 ? 0 : (double) total / count;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(
                getOverallAverageScore(),
                o.getOverallAverageScore()
        );
    }
}
