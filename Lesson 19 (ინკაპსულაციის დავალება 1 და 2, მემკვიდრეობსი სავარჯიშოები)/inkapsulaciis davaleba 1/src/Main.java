public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 25, 2020, 3.5);
        Student student2 = new Student("Jane", "Doe", 24, 2021, 3.2);
        Student student3 = new Student("Bob", "Smith", 23, 2022, 3.7);
        Student student4 = new Student("Alice", "Smith", 22, 2023, 3.9);
        Student student5 = new Student("Jenny", "Smith", 21, 2024, 3.4);

        Student[] students = {student1, student2, student3, student4, student5};
        for (Student student : students) {
            student.printStudentInfo();
        }

        System.out.println("Best student: " + getBestStudent(students));
    }

    public static String getBestStudent(Student[] students) {
        double maxGpa = students[0].getGpa();
        String bestStudentFirstName = students[0].getFirstName();
        String bestStudentLastName = students[0].getLastName();
        for (Student student : students) {
            if (student.getGpa() > maxGpa) {
                maxGpa = student.getGpa();
                bestStudentFirstName = student.getFirstName();
                bestStudentLastName = student.getLastName();
            }

        }
        return bestStudentFirstName + " " + bestStudentLastName;
    }
}
