import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz : ");
        int n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        int n2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz : ");
        System.out.println("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölmwe ");
        System.out.println("Seçiminiz : ");
        int select = input.nextInt();

        switch (select)
        {
            case 1:
                System.out.println(n1 + " + "+ n2 +" = "+ (n1+n2));
                break;
            case 2:
                System.out.println(n1 + " - "+ n2 +" = "+ (n1-n2));
                break;
            case 3:
                System.out.println(n1 + " x "+ n2 +" = "+ (n1*n2));
                break;
            case 4:
                System.out.println(n1 + " / "+ n2 +" = "+ (n1/n2));
                break;
        }
    }
}
