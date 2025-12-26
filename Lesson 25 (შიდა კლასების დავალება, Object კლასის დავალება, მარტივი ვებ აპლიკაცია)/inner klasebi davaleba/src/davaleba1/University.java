package davaleba1;

public class University {
    private String universityName;
    private boolean isPublic;
    private int numberOfSchools;

    public University(String universityName, boolean isPublic, int numberOfSchools) {
        this.universityName = universityName;
        this.isPublic = isPublic;
        this.numberOfSchools = numberOfSchools;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public int getNumberOfSchools() {
        return numberOfSchools;
    }

    public void setNumberOfSchools(int numberOfSchools) {
        this.numberOfSchools = numberOfSchools;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", isPublic=" + isPublic +
                ", numberOfSchools=" + numberOfSchools +
                '}';
    }

    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String idNumber;
        private double gpa;
        private int year;

        public Student(String firstName, String lastName, int age, String idNumber, double gpa, int year) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.idNumber = idNumber;
            this.gpa = gpa;
            this.year = year;
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getIdNumber() {
            return idNumber;
        }

        public void setIdNumber(String idNumber) {
            this.idNumber = idNumber;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", age=" + age +
                    ", idNumber='" + idNumber + '\'' +
                    ", gpa=" + gpa +
                    ", year=" + year +
                    '}';
        }
    }
}
