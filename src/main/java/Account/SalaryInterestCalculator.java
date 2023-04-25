package Account;


public class SalaryInterestCalculator extends AccountHandler {
    @Override
    public void getFinalAmount(int amount, int duration) {
        amount= amount + (amount*duration*(4))/100;
        System.out.println("Your final amount in Salary Account would be " + amount);
    }
}
