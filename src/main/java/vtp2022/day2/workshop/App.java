package vtp2022.day2.workshop;

import vtp2022.day2.workshop.account.BankAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My ATM Machine - POSSBank" );
        BankAccount bkAcc = new BankAccount("Kenneth Bank Account");
        bkAcc.deposit("100");
        System.out.println("My new account balance >" + bkAcc.getBalance());
        bkAcc.withdraw("20");
        System.out.println("My new account balance >" + bkAcc.getBalance());
    }
}
