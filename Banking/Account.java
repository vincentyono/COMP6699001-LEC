package Banking;

public class Account {
  private Double balance;

  public Account(Double balance) {
    this.balance = balance;
  }

  public Double getBalance() {
    return this.balance;
  }

  public Boolean deposit(Double amount) {
    if (amount > 0.0) {
      this.balance += amount;
      return true;
    }
    return false;
  }

  public Boolean withdraw(Double amount) {
    if (this.balance >= amount) {
      this.balance -= amount;
      return true;
    }
    return false;
  }
}