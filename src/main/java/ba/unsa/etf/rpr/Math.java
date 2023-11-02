package ba.unsa.etf.rpr;

class Math {
    public static int faktorijel(int n)
    {
        int sum=1;
        for (int i=n;i>0;i--)
        {
            sum*=i;
        }
        return sum;
    }
    public static double sinus(double n)
    {
        double a = java.lang.Math.toRadians(n);
        return java.lang.Math.sin(a);
    }
}