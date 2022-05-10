package Banking;

public class Account {
  private double balance;

  public Account(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return this.balance;
  }

  public Boolean deposit(double amount) {
    if (amount > 0) {
      this.balance += amount;
      return true;
    }
    return false;
  }

  public Boolean withdraw(double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    }
    return false;
  }
}