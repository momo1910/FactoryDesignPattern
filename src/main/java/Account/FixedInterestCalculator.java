package Account;


public class FixedInterestCalculator extends AccountHandler {
    @Override
    public void getFinalAmount(int amount, int duration) {
        Double amount1= amount + (amount*duration*(5.5))/100;
        System.out.println("Your final amount in Fixed Deposit account would be " + amount1);
    }
}
