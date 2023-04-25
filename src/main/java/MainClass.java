import Factory.AccountFactory;

import java.util.Scanner;

public class MainClass {
    public static void main (String args[]){

        AccountFactory accountService=new AccountFactory();
        System.out.println("Hello I am HDFC Interest Calculator factory Pattern example");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter type of ACCOUNT you hold among CURRENT,SALARY,FIXED,RECURRING");
        String account=sc.next();
        System.out.println("Enter Principal Amount");
        int principal=sc.nextInt();
        System.out.println("Enter the Duration in years");
        int duration=sc.nextInt();
        accountService.getMaturityAmount(account,principal,duration);

    }
}
