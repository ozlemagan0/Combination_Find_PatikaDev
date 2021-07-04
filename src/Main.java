import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r, nt=1, rt=1, extt=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n number:");
        n = sc.nextInt();
        System.out.print("Enter r number:");
        r = sc.nextInt();

        for (int i=1; i<=n; i++)
        {
            nt*=i;
        }
        for(int k=1; k<=r; k++)
        {
            rt*=k;
        }
        int ext=n-r;
        for(int j=1; j<=ext; j++)
        {
            extt*=j;
        }

        double conc= nt/(ext*rt);
        System.out.println("Result:"+conc);
    }
}
