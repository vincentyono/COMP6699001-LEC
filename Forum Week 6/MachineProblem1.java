import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

class MachineProblem1
{
    public static void main(String[] args) 
    {
        PrintArray();
    }
    static void PrintArray()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number items: ");
        int numberOfItems = scanner.nextInt();
        System.out.printf("Enter the value of all items (seperated by space): ");
        List<String> items = new ArrayList<String>();
        for(int i = 0; i < numberOfItems; i++)
        {
            items.add(scanner.next());            
        }
        scanner.close();
        System.out.printf("[");
        for(int i = 0; i < numberOfItems; i++)
        {
            if(i == numberOfItems - 1)
            {
                System.out.printf("%s", items.get(i));
            }
            else
            {
                System.out.printf("%s, ", items.get(i));
            }
        }
        System.out.println("]");
    }
}