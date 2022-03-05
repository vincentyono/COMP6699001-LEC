package Drill1;

class Question12
{
    public static void main(String[] args)
    {
        System.out.println("number\tsquare\tcube");
        for(int i = 0; i <= 10; i++)
        {
            System.out.println(String.format("%d\t%d\t%d", i, square(i), cube(i)));
        }   
    }

    static int square(int n)
    {
        return n * n;
    }

    static int cube(int n)
    {
        return n * n * n;
    }
}