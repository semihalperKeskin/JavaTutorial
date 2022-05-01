import java.util.Scanner;

public class Vkindex {
    public static void main(String[] args) {
        int  kilo;
        double boy;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (metre cinsinden) : ");
        boy = input.nextDouble();
        System.out.println();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextInt();
        System.out.println();

        double VKi = kilo / (boy * boy);

        System.out.print("Vücut kitle indexiniz : "+ VKi);

    }
}
