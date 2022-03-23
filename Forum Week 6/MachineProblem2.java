import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

class MachineProblem2
{
    public static void main(String[] args)
    {
        printArrayInStars();
    }
    static void printArrayInStars()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of items: ");
        int numberOfItems = scanner.nextInt();
        System.out.printf("Enter the value of all items (seperated by space): ");
        List<String> items = new ArrayList<String>();
        for (int i = 0; i < numberOfItems; i++)
        {
            items.add(scanner.next());
        }
        scanner.close();
        String stars = "";
        int nStars = 0;
        for(int i = 0; i < items.size(); i++)
        {
            nStars = Integer.parseInt(items.get(i));
            for(int j = 0; j < nStars; j++)
            {
                stars += "*";
            }
            System.out.printf("%d: %s(%d)\n", i, stars, nStars);
            stars = "";
        }
        
    }
}