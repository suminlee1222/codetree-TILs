import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        setStarts(n);
    }

    public static void setStarts(int n){

        for(int i=0; i < n; i++){
            System.out.println("12345^&*()_");
        }
    }
}