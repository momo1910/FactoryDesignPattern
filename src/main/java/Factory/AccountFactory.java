package Factory;

import Account.*;

public class AccountFactory {
    AccountHandler accountHandler=null;
    public AccountHandler getAccountHandler(String account){
        if(account.equalsIgnoreCase("CURRENT"))
            accountHandler= new CurrentInterestCalcualtor();
        else if(account.equalsIgnoreCase("SALARY"))
            accountHandler=new SalaryInterestCalculator();
        else if(account.equalsIgnoreCase("FIXED"))
            accountHandler=new FixedInterestCalculator();
        else if(account.equalsIgnoreCase("RECURRING"))
            accountHandler= new RecurringInterestCalculator();
        return accountHandler;
    }

    public void getMaturityAmount(String account,int amount,int duration){
        accountHandler=getAccountHandler(account);
        accountHandler.getFinalAmount(amount,duration);
    }


}

