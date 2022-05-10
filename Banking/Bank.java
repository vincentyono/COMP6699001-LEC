package Banking;
import java.util.ArrayList;

public class Bank {
  private ArrayList<Customer> customers;
  private int numberOfCustomers;
  private String bankName;

  public Bank(String bankName) {
    this.bankName = bankName;
    this.customers = new ArrayList<Customer>();
    this.numberOfCustomers = this.customers.size();
  }

  public void addCustomer(String firstName, String lastName) {
    customers.add(new Customer(firstName, lastName));
    this.numberOfCustomers = customers.size();
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
