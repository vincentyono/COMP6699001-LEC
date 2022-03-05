package Drill1;

class Question11
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        System.out.println(String.format("Before: a = %d, b = %d", a, b));
        int temp = a;
        a = b;
        b = temp;
        System.out.println(String.format("After: a = %d, b = %d", a, b));
    }

}