package Banking;
import java.util.ArrayList;

public class Bank {
  private ArrayList<Customer> customers;
  private int numberOfCustomers;
  private String bankName;

  public Bank(String bankName) {
    this.bankName = bankName;
    this.customers = new ArrayList<>();
    this.numberOfCustomers = this.customers.size();
  }

  public void addCustomer(String firstName, String lastName, String userName, char[] password) {
    customers.add(new Customer(firstName, lastName, userName, password));
    this.numberOfCustomers++;
  }

  public int login(String userName, char[] password) {
    if (this.numberOfCustomers == 0) {
      return -1;
    }
    for (Integer i = 0; i < this.customers.size(); i++) {
      if (this.customers.get(i).getUserName().equals(userName)
          && this.customers.get(i).verifyPassword(password)) {
        return i;
      }
    }
    return -1;
  }

  public int getNumberOfCustomers() {
    return this.numberOfCustomers;
  }

  public Customer getCustomer(int index) {
    return customers.get(index);
  }

  public String getBankName() {
    return this.bankName;
  }
}
