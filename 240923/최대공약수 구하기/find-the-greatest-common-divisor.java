import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        print(n,m);

    }

    public static void print(int n, int m){
        int gcd = 0;
        for(int i = 2; i < m; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }

    System.out.print(gcd);

    }
}