public class Main{
    public static void main(String [] args){
            BankAccount bankacc1 = new BankAccount("Youssef Tahiri", 56555.32, "123 Main St., Austin, TX, 78701", 'M',24,8547562);
            System.out.println(bankacc1);
            bankacc1.deposit(25520);
            System.out.println(bankacc1.getBalance());
            bankacc1.withdraw(1552);
            System.out.println(bankacc1);
        }
}