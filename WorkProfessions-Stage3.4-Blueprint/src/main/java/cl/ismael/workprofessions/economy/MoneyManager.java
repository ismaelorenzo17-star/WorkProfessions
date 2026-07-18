package cl.ismael.workprofessions.economy;
public class MoneyManager{
 private double balance;
 public void deposit(double a){balance+=a;}
 public boolean withdraw(double a){if(balance<a)return false; balance-=a; return true;}
 public double getBalance(){return balance;}
}
