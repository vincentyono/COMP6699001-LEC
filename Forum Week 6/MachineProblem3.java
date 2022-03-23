import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class MachineProblem3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        List<Integer> grades = new ArrayList<Integer>();
        for (int i = 0; i < numberOfStudents; i++)
        {
            System.out.printf("Enter the grade for student %d: ", i + 1);
            grades.add(scanner.nextInt());
        }
        scanner.close();
        int min = grades.get(0), max = grades.get(0); 
        double sum = 0;
        for(int i = 0; i < grades.size(); i++)
        {
            if(grades.get(i) < min)
            {
                min = grades.get(i);
            }

            if(grades.get(i) > max)
            {
                max = grades.get(i);
            }

            sum += grades.get(i);
        }
        System.out.printf("The average is: %.2f\n", sum / grades.size());
        System.out.printf("The minimum is: %d\n", min);
        System.out.printf("The maximum is: %d\n", max);
    }
}