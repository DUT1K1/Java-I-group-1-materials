package exercise3;

public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Cash payment is made.");
    }
}
