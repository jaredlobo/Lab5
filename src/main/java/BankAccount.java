import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */

    /**
     * Documents different types of Bank Accounts
     */

    public enum BankAccountType {
        /**
         * checkings account
         */
        CHECKINGS,

        /**
         * savings account
         */
        SAVINGS,

        /**
         * student account
         */
        STUDENT,

        /**
         * workplace account
         */
        WORKPLACE
    }

    /**
     * accountNumber type int bank account number
     */
    private int accountNumber;

    /**
     * accountType type BankAccountType account type
     */
    private BankAccountType accountType;

    /**
     * accountBalance type double bank account balance
     */
    private double accountBalance;

    /**
     * ownerName type String bank account owner's name
     */
    private String ownerName;

    /**
     * interestRate type double bank account rate of interest
     */
    private double interestRate;

    /**
     * interestEarned type double bank account interest earned
     */
    private double interestEarned;

    /**
     * Parameterized constructor to initialize ownerName and accountType
     *
     * @param name type String owner's name
     * @param accountCategory type BankAccountType type of account
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    /**
     * getter function for account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }


    /**
     * setter function for account number
     *
     * @param setAccNum type int initialize accountNumber
     */
    public void setAccountNumber(final int setAccNum) {
        accountNumber = setAccNum;
    }


    /**
     * getter function for owner's name
     */
    public String getOwnerName() {
        return ownerName;
    }


    /**
     * setter function for owner's name
     *
     * @param setName type String initialize ownerName
     */
    public void setOwnerName(final String setName) {
        ownerName = setName;
    }


    /**
     * getter function for account balance
     */
    public double getAccountBalance() {
        return accountBalance;
    }


    /**
     * setter function for account balance
     *
     * @param setAccBal type double initialize accountBalance
     */
    public void setAccountBalance(final double setAccBal) {
        accountBalance = setAccBal;
    }


    /**
     * getter function for interest earned
     */
    public double getInterestEarned() {
        return interestEarned;
    }


    /**
     * setter function for interest earned
     *
     * @param setIntEarn type double initialize interest earned
     */
    public void setInterestEarned(final double setIntEarn) {
        interestEarned = setIntEarn;
    }
}
