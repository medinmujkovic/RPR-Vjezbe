package ba.unsa.etf.rpr;

import java.lang.Math;

class sinusFaktorijel {
    public static void main(String[] args) {
        int f=faktorijel(Integer.valueOf(args[0]));
        double s=sinus(Double.valueOf(args[1]));
        System.out.println("Faktorijel: " +f+"Sinus: "+s);
    }
    static int faktorijel(int n)
    {
        int sum=1;
        for (int i=n;i>0;i--)
        {
            sum*=i;
        }
        return sum;
    }
    static double sinus(double n)
    {
        double a = Math.toRadians(n);
        return Math.sin(a);
    }
}