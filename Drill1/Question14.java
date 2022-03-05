package Drill1;

class Question14 {
    public static void main(String[] args)
    {
        System.out.println(formattedTime(3680));
        System.out.println(formattedTime(6721));
    }

    static String formattedTime(int sec)
    {
        int s = sec;
        int m = sec / 60;
        int h = m / 60;
        s = s - (m * 60);
        m = m % 60;
        return String.format("%d hours %d minutes %d seconds", h, m, s);
    }
    
}
