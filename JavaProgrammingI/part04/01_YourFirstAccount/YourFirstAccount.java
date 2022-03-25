public class YourFirstAccount {
    public static void main(String[] args) {
        Account test = new Account ("test's acount", 100.00);
        test.deposit(20.0);
        System.out.println(test);
    }
}
