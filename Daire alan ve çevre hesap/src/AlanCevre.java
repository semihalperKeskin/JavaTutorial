import java.util.Scanner;

public class AlanCevre {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz : ");
        r = input.nextInt();
        System.out.println();

        System.out.print("Merkes açısını giriniz : ");
        a = input.nextInt();
        System.out.println();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double formul = (pi *(r * r) * a) / 360;

        System.out.println("Dairenin alanı : "+ alan);
        System.out.println("Dairenin çevresi : "+ cevre);
        System.out.println("Alan : " +formul);
    }
}
