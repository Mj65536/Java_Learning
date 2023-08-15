public class BankTest_0815
{
    public static void main(String[] args)
    {
//        Bank_0815 b1 = new Bank_0815();
//        Bank_0815 b2 = new Bank_0815();

        Bank_0815 bank1 = Bank_0815.getInstance();
        Bank_0815 bank2 = Bank_0815.getInstance();
        System.out.println(bank1 == bank2);
    }
}

class Bank_0815
{
    private Bank_0815()
    {

    }
    private static Bank_0815 instance = new Bank_0815();

    public static Bank_0815 getInstance()
    {
        return instance;
    }
}
