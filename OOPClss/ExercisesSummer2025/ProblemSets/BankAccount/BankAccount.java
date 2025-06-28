public class BankAccount{
    private String name;
    private double balance;
    private String address;
    private char sex;
    private int age;
    private long accountNum;

    public BankAccount(String name, double balance, String address, char sex, int age, long accountNum){
        this.name=name;
        this.balance=balance;
        this.address=address;
        this.sex=sex;
        this.age=age;
        this.accountNum=accountNum;
    }

    public void deposit(int amount){
       if(amount<=0){
           throw new IllegalArgumentException("Deposit must be positive");
       }
       this.balance+=amount;
    }

    public void withdraw(int amount){
        if(amount>this.balance){
            throw new IllegalArgumentException("You cannot withdraw more than the money you have");
        }
        this.balance-=amount;
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString(){
        return String.format("Bank Acoount{owner=%s, balance=%.2f, accountNumber=%d}",name, balance,accountNum);
    }
}