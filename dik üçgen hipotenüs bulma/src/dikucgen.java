import java.util.Scanner;
public class dikucgen {
    public static void main(String[] args) {
        int a, b;
        double c, alan, u;
        Scanner girdi = new Scanner(System.in);
        System.out.print("A kenarını giriniz : ");
        a = girdi.nextInt();
        System.out.println();
        System.out.print("B kenarını giriniz : ");
        b = girdi.nextInt();
        System.out.println();
        c = Math.sqrt((a*a) +(b*b));
        u = (a+b+c)/2;
        alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Hipotenüs : " + c);
        System.out.println("Üçgenin çevresi : "+ (2*u));
        System.out.println("Üçgenin alanı : "+ alan);

    }
}
