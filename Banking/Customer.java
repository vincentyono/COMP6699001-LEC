package Banking;

import java.util.Arrays;

public class Customer {
  private String firstName;
  private String lastName;
  private String userName;
  private char[] password;
  private Account account;

  public Customer(String firstName, String lastName, String userName, char[] password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
    this.account = new Account(0.0);
  }

  public String getFirstName() {
    return this.firstName;
  }
  public String getLastName() {
    return this.lastName;
  }
  public String getUserName() {
    return this.userName;
  }
  public Account getAccount() {
    return this.account;
  }
  public void setAccount(Account account) {
    this.account = account;
  }
  public Boolean verifyPassword(char[] password) {
    return Arrays.equals(this.password, password);
  }
}