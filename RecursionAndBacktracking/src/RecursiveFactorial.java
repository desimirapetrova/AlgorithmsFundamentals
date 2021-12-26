import java.util.Scanner;

public class RecursiveFactorial {
    static int sum=1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());


        factorial(n);

        System.out.println(sum);

    }

    private static void factorial(int n) {
        if (n==1){
            return;
        }
        sum*=n;
        factorial(n-1);
    }
}
