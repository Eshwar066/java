package Projects.BankProject;

public class main {
    public static void main(String[] args) {
//        Account account1=new Account(1001,"Eshwar",100);
//        Account account2=new Account(1002,"Teja",100);

        Bank bank=new Bank();
        bank.createAccount(1001,"Eshwar",100);
        bank.credit(1001,2000);
        bank.deposit(1001,1023);
        bank.display(1001);



//        bank.display(1001);
    }
}
