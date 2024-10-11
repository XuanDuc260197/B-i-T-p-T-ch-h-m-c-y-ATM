public class Login {
    private String username;
    private String password;
    public int balance;

    public Login(String username, String password) { //phuong thuc khoi tao//
        this.username = username;
        this.password = password;
        this.balance = 1000000;
    }
    public void display() {
        System.out.println("Login success");
        System.out.print("Username: "+username);
        System.out.print("Balance: "+balance);
    }
    public int processing(int balance) {
        this.balance = this.balance - balance;
        return this.balance;
    }
}
