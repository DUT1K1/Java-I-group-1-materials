package exercise3;

public class PayPalPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("PayPal payment is made.");
    }
}
