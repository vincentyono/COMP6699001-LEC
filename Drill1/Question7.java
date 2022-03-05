package Drill1;

class Question7
{
    public static void main(String[] args)
    {
        int a;
        int b;
        int result;

        // a)
        a = 4;
        b = 12;
        result = a + b / 3;
        System.out.println(String.format("a) a = %d, b = %d, result = %d", a, b, result)); // a = 4, b =12, result = 8

        // b)
        a = 3;
        a = a + 3;
        result = a - b;
        System.out.println(String.format("b) a = %d, b = %d, result = %d", a, b, result)); // a = 6, b = 12, result = -6

        // c)
        a = 2;
        b = a + 1;
        a = b + 2;
        result = a + b + a;
        result = -result;
        System.out.println(String.format("c) a = %d, b = %d, result = %d", a, b, result)); // a = 5, b = 3, result = -13
        
        // d)
        a = 3;
        b = 11;
        result = (b % a) + 1;
        System.out.println(String.format("d) a = %d, b = %d, result = %d", a, b, result)); // a = 3, b = 11, result = 3
        
        // e)
        a = 3;
        b = a++;
        result = 1;
        result += a - b;
        System.out.println(String.format("e) a = %d, b = %d, result = %d", a, b, result)); // a = 4, b = 3, result = 2
        
        // f)
        String s = "jjj";
        String t = "xxx";
        String result2 = s + s + t;
        System.out.println(String.format("f) s = %s, t = %s, result2 = %s", s, t, result2)); // s = jjj, t = xxx, result2 = jjjjjjxxx
    }
}