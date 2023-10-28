package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Djeljivost {
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        sumaCifara(n);
    }
    static void sumaCifara(int n) {
        for(int i=1;i<=n;i++)
            {
                int temp=i;
                int sum=0;
                while(temp>0)
                {
                    sum += temp%10;
                    temp=temp/10;
                }
                if(i%sum==0) System.out.println(i);
            }
    }
}