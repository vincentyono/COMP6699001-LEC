package Drill1;

import java.lang.Math;
import java.util.Scanner;

class Question10
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter x1 value: ");
        String userInput1 = scanner.nextLine();
        System.out.printf("Enter x2 value: ");
        String userInput2 = scanner.nextLine();
        System.out.printf("Enter x3 value: ");
        String userInput3 = scanner.nextLine();
        scanner.close();
        int x1 = Integer.parseInt(userInput1);
        int x2 = Integer.parseInt(userInput2);
        int x3 = Integer.parseInt(userInput3);
        double mean = mean(x1, x2, x3);
        double variance = variance(x1, x2, x3);
        double deviation = deviation(variance);
        System.out.println(String.format("Mean: %f\nVariance: %f\nDeviation: %f", mean, variance, deviation));
    }

    static double mean(int x1, int x2, int x3)
    {
        return (x1 + x2 + x3) / 3;
    }

    static double variance(int x1, int x2, int x3)
    {
        double mean = mean(x1, x2, x3);
        return (Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2)) / 3;
    }

    static double deviation(double variance)
    {
        return Math.sqrt(variance);
    }
}