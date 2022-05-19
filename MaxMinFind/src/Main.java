import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı giriceksiniz : ");
        int numberCount = input.nextInt();

        int number = 0;
        int max = 0, min = 0;

        for(int i = 1; i <= numberCount; i++) {
            System.out.print(i+". sayıyı giriniz : ");
            number = input.nextInt();
            if (number > max)
            {
                max = number;
            }
            else if (number < min)
            {
                min = number;
            }
        }
        System.out.println("En büyük sayı : "+ max);
        System.out.println("En küçük sayı : "+ min);

    }
}
