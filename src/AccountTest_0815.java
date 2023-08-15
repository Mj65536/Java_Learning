public class AccountTest_0815
{
    public static void main(String[] args)
    {
        Account_0815 acct1 = new Account_0815();
        System.out.println(acct1);

        Account_0815 acct2 = new Account_0815("99999999",2556.9);
        System.out.println(acct2);

        Account_0815.setInterestRate(0.8);
        Account_0815.setMinBalance(10);


        System.out.println(Account_0815.getInterestRate());
        System.out.println(Account_0815.getMinBalance());



    }
}
