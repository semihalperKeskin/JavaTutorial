import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int üs, basamakDeger = 0, n, sayiClone=0 , armstrg = 0, realNum, sub, sub2=1;
        String sayi;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayiyi giriniz : ");
        sayi = input.nextLine();

        System.out.print("Sayının üstünü giriniz : ");
        üs = input.nextInt();


        sayiClone = sayi.length();
        realNum = Integer.parseInt(sayi);
        n = realNum;



        for (int i = 0; i < sayiClone; i++)
        {

            sub = realNum % 10;
            for (int j = 0; j < üs; j++)
                sub2 *= sub;
            armstrg += sub2;
            sub2 = 1;

            realNum /= 10;

        }




        if (armstrg == n)
            System.out.print("Armstrong sayı");
        else
            System.out.print("Armstrong değil");

    }
}
