import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n){
        int k = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(k == 9) k=0;
                k++;
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}