package Banking;

import java.io.Console;
import java.util.Scanner;

public class Driver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Console console = System.console();
    Bank simulationBank = new Bank("Simulation Bank");
    int customerId = -1;
    String command;
    Boolean exit = false;
    clearConsole();
    System.out.println("--------------------------");
    System.out.println("Welcome to " + simulationBank.getBankName());
    System.out.println("--------------------------");
    System.out.println();

    while (!exit) {
      while (customerId < 0) {
        System.out.println("login - Log in as a user");
        System.out.println("create - Create a new account");
        System.out.println("exit - exit the program");
        System.out.println();
        System.out.printf("Enter Command: ");
        command = scanner.nextLine();

        if (command.equals("login")) {
          clearConsole();
          System.out.println("-------------------");
          System.out.println("Login to an account");
          System.out.println("-------------------");
          System.out.println();
          System.out.printf("Enter username: ");
          String username = scanner.nextLine();
          System.out.printf("Enter password: ");
          char[] password = console.readPassword();
          if (simulationBank.login(username, password) >= 0) {
            customerId = simulationBank.login(username, password);
            clearConsole();
            System.out.printf("Hello, %s %s\n",
                simulationBank.getCustomer(customerId).getFirstName(),
                simulationBank.getCustomer(customerId).getLastName());
          } else {
            clearConsole();
            System.out.println("Incorrect username or password");
            System.out.println();
          }
        } else if (command.equals("create")) {
          clearConsole();
          System.out.println("-----------------");
          System.out.println("Create an account");
          System.out.println("-----------------");
          System.out.println();
          System.out.printf("Enter first name: ");
          String firstName = scanner.nextLine();
          System.out.printf("Enter last name: ");
          String lastName = scanner.nextLine();
          System.out.printf("Enter username: ");
          String username = scanner.nextLine();
          char[] password = console.readPassword("Enter password: ");
          simulationBank.addCustomer(firstName, lastName, username, password);
          customerId = simulationBank.login(username, password);
          clearConsole();
          System.out.printf("Hello, %s %s\n", simulationBank.getCustomer(customerId).getFirstName(),
              simulationBank.getCustomer(customerId).getLastName());
          System.out.println();
        } else if (command.equals("exit")) {
          exit = true;
          break;
        } else {
          clearConsole();
          System.out.println("Invalid Command");
          System.out.println();
        }
      }
      while (customerId > -1) {
        System.out.println("balance - Check Balance");
        System.out.println("withdraw - withdraw sum of cash");
        System.out.println("deposit - deposit sum of cash");
        System.out.println("logout - logout from current account");
        System.out.println("exit - exit the program ");
        System.out.println();
        System.out.printf("Enter command: ");
        command = scanner.nextLine();
        if (command.equals("balance")) {
          clearConsole();
          System.out.println("-----------------");
          System.out.printf(
              "balance: $%.2f\n", simulationBank.getCustomer(customerId).getAccount().getBalance());
          System.out.println("-----------------");
          System.out.println();
          System.out.println();
        } else if (command.equals("deposit")) {
          System.out.printf("Enter ammount: ");
          String input = scanner.nextLine();
          Double amount = Double.parseDouble(input);
          if (simulationBank.getCustomer(customerId).getAccount().deposit(amount)) {
            clearConsole();
            System.out.println("--------------------------------------------");
            System.out.printf("Successfully deposited $%.2f\n", amount);
            System.out.println("--------------------------------------------");
            System.out.println();
          } else {
            clearConsole();
            System.out.println("Invalid amount");
            System.out.println();
          }
          System.out.println(simulationBank.getCustomer(customerId).getAccount().deposit(amount));

        } else if (command.equals("withdraw")) {
          System.out.printf("Enter ammount: ");
          String input = scanner.nextLine();
          Double amount = Double.parseDouble(input);
          simulationBank.getCustomer(customerId).getAccount().withdraw(amount);
        } else if (command.equals("logout")) {
          customerId = -1;
          clearConsole();
          System.out.println("Logged out");
          System.out.println();
        } else if (command.equals("exit")) {
          exit = true;
          break;
        }
      }
    }
    scanner.close();
  }

  static void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}