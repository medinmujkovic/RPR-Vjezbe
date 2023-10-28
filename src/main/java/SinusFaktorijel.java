import java.util.Scanner;
import java.lang.Math;

class sinusFaktorijel {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        faktorijel(n);
        sinus(n);

    }
    static void faktorijel(int n)
    {
        int sum=1;
        for (int i=n;i>0;i--)
        {
            sum*=i;
        }
        System.out.println(sum);
    }
    static void sinus(int n)
    {
        double a = Math.toRadians(n);
        System.out.println(Math.sin(a));
    }
}