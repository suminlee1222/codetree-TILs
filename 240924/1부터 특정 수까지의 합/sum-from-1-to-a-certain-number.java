import java.util.Scanner;

public class Main {
    public static int add(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }

        return sum / 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        int totalNum = add(num1);
        System.out.println(totalNum);
    }
}