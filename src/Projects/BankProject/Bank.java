package Projects.BankProject;

import java.util.HashMap;

public class Bank {

    private HashMap<Integer,Account> accounts;

    public Bank(){
        accounts=new HashMap<>();
    }

    public void createAccount(Integer AccNum,String AccHolderName, Integer balance){
        if(!accounts.containsKey(AccNum)){
            Account account=new Account(AccNum,AccHolderName,balance);
            accounts.put(AccNum,account);
//            return accounts;
        }else{
            System.out.println("account number already exits");
        }
    }

    public void deposit(Integer AccNum,double amount){
        Account account=accounts.get(AccNum);
        if(account!=null){
            account.debit(amount);
        }else{
            System.out.println("account num not exits");
        }
    }

    public void credit(Integer AccNum,double amount){
        Account account=accounts.get(AccNum);
        if(account!=null){
            account.credit(amount);
        }else{
            System.out.println("account num not exits");
        }
    }

    public void display(Integer AccNum){
        Account account=accounts.get(AccNum);
        if(account!=null){
            System.out.println("Account Holder: "+account.getAccHolder());
            System.out.println("Account Number: "+account.getAccNum());
            System.out.println("Account Balance: "+account.getBalance());
            System.out.println("-------------------------");
        }else{
            System.out.println("account num not exits");
        }
    }
}
