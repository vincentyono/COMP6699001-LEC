package Drill1;

class Question13 {
    public static void main(String[] args)
    {
        Quadratic quadratic = new Quadratic(1, 5, -14);
        System.out.println(String.format("x: %f or %f ", quadratic.positive, quadratic.negative));
    }
}

class Quadratic
{
    public double negative;
    public double positive;

    public Quadratic(double a, double b, double c)
    {
        negative = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        positive = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
    }
}
