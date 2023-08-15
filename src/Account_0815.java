public class Account_0815
{
    private int id;
    private String password;
    private double balance;
    private static double interestRate;
    private static double minBalance = 1.0;

    private static int init = 1001;

    public Account_0815()
    {
        this.id = init;
        init++;
        password = "12345678";
    }

    public Account_0815(String password, double balance) {
        this.password = password;
        this.balance = balance;
        this.id = init;
        init++;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account_0815.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account_0815.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account_0815{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
