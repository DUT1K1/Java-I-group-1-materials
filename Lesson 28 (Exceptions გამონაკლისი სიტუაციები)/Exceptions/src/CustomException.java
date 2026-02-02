public class CustomException {
    public static void main(String[] args) {
//        try {
//            setGrade(121);
//        } catch (InvalidGradeException e) {
//            System.out.println("Custom error: " + e.getMessage());
//        }


//        setAge(15);

        try {
            System.out.println(withdraw(10, 50));
        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
        }
    }

    static int withdraw(int balance, int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money");
        }
        return balance - amount;
    }


    static void setAge(int age) {
        if (age < 18 || age > 150) {
            throw new InvalidAgeException("Age must be 18 <= age <= 150");
        }
    }

    static void setGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be 0 <= grade <= 100");
        }
        System.out.println("Grade set successfully: " + grade);
    }
}
