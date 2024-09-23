import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n, m);
    }

    public static void print(int n, int m){
        int gcd = 0;
        

        for(int i = 1; i < Math.max(n, m); i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        int scd = (n*m) / gcd;
        System.out.print(scd);

    }
}