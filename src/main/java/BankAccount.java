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
     * CHECKINGS - checkings account
     * SAVINGS - savings account
     * STUDENT - student account
     * WORKPLACE - workplace account
     *
     * @see BankAccountType
     */
    public enum BankAccountType {
        CHECKINGS,
        SAVINGS,
        STUDENT,
        WORKPLACE
    }

    /**
     * accountNumber type int bank account number
     * accountType type BankAccountType type of account
     * accountBalance type double acount balance
     * L̥
     */

    private int accountNumber;
    private BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    private double interestRate;
    private double interestEarned;

    public BankAccount(final String name, final BankAccountType accountCategory) {
        ownerName = name;
        accountType = accountCategory;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(final int setAccNum) {
        accountNumber = setAccNum;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String setName) {
        ownerName = setName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(final double setAccBal) {
        accountBalance = setAccBal;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double setIntEarn) {
        interestEarned = setIntEarn;
    }
}
