package Account;


public class RecurringInterestCalculator extends AccountHandler {
    @Override
    public void getFinalAmount(int amount, int duration) {

        amount= amount + (amount*duration*(6))/100;
        System.out.println("Your final amount in Recurring Account would be " + amount);
    }
}
