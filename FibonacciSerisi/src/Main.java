import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fibonacci Serisi");
        int n = 0, x = 1, sum = 0;

        for(int i = 0 ; i <= 10; i++)
        {
            sum = n + x;
            System.out.println(n +" + "+ x + " = "+ sum);
            n = x;
            x = sum;
        }
    }
}
