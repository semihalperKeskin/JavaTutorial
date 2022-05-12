import com.sun.tools.javac.Main;

import java.util.Scanner;

public class gecmeNotuHsp {
    public static void main(String[] args) {
        int turk, mat, kim, müz, fiz;
        Scanner input = new Scanner(System.in);

        System.out.println("Türkçe notunu giriniz : ");
        turk = input.nextInt();

        System.out.println("Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.println("Kimya notunu giriniz : ");
        kim = input.nextInt();

        System.out.println("Fizik notunu giriniz : ");
        fiz = input.nextInt();

        System.out.println("Müzik notunu giriniz : ");
        müz = input.nextInt();


        double avarage = (turk + mat + kim + fiz + müz) / 5 ;
        if(avarage < 55)
        {
            System.out.println("Sınıfta kaldınız.");
            System.out.println("Ortalamanız : " + avarage);
        }
        else
        {
            System.out.println("Tebrikler sınıfta başarı ile geçtiniz.");
            System.out.println("Ortalamanız : " + avarage);
        }
    }
}
