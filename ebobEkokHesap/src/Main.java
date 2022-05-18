import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ebob-Ekok Hesaplanıcak 1. sayıyı giriniz : ");
        int n1 = input.nextInt();

        System.out.print("Ebob-Ekok Hesaplanıcak 2. sayıyı giriniz : ");
        int n2 = input.nextInt();

        int s = 1;
        int ebob= 0, ekok = 0;
        while(s <= n1)
        {
            if((n1 % s == 0) && (n2 % s == 0))
            {
                 ebob = s;
            }
            s++;
        }
         ekok = (n1 * n2) / ebob;



        System.out.println("Ekok : "+ ekok );
        System.out.println("Ebob : "+ ebob );

    }
}
