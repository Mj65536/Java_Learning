public class User_0817
{
    private String userName;
    private String password;
    private long registrationTime;

    public String getUsername() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

    public User_0817()
    {
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        userName = System.currentTimeMillis()+"";


    }

    public User_0817(String userName,String password)
    {
        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
        System.out.println(userName+"\n"+password);
    }
    public String getInfo()
    {
        return userName+"\n"+password+"\n"+registrationTime;

    }
}
