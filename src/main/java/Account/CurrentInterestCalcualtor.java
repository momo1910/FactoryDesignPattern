package Account;


public class CurrentInterestCalcualtor extends AccountHandler {


    @Override
    public void getFinalAmount(int amount,int duration) {
        System.out.println("Your final amount in Current Account would be " + amount);
    }
}
