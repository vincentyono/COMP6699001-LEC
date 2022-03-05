package Drill1;
import java.util.Scanner;

class Question9 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter temperature (in Celsius): ");
        String userInput = scanner.nextLine();
        scanner.close();
        double celsius = Double.parseDouble(userInput);
        System.out.println(celsiusToFahrenheit(celsius));
    }

    static String celsiusToFahrenheit(double celsius)
    {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        return String.format("%1$.1f Celsius degrees are %2$.2f Fahrenheit degrees.", celsius, fahrenheit);
    }
}
