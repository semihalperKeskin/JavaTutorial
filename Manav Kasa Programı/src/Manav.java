import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67,domates = 1.11,muz=0.95,patlican=5.00;
        int armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : " );
        armutKilo = input.nextInt();
        System.out.println();

        System.out.print("Elma kaç kilo? : " );
        elmaKilo = input.nextInt();
        System.out.println();

        System.out.print("Domates kaç kilo? : " );
        domatesKilo = input.nextInt();
        System.out.println();

        System.out.print("Muz kaç kilo? : " );
        muzKilo = input.nextInt();
        System.out.println();

        System.out.print("Patlıcan kaç kilo? : " );
        patlicanKilo = input.nextInt();
        System.out.println();

        System.out.println("Toplam tutar : " + ((armut*armutKilo)+(elma*elmaKilo)+(domates*domatesKilo)+(muz*muzKilo)+(patlican*patlicanKilo)) + "TL");
    }
}
