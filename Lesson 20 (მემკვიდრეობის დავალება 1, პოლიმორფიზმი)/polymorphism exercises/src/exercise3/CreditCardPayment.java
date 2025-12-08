package exercise3;

public class CreditCardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Credit card payment is made.");
    }
}
