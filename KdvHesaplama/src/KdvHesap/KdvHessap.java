package KdvHesap;

import java.util.Scanner;

public class KdvHessap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz : ");
        double tutar  = input.nextDouble();
        double kdv = tutar>1000 ? 0.18 : 0.08;
        System.out.println("Kdv'siz Fiyat : " + tutar);
        System.out.println("Kdv'li Fiyat : " + ((tutar*kdv)+tutar));
        System.out.println("Kdv tutar : " + kdv);

    }
}
