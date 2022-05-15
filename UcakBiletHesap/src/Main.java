import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe, age, passengerType, ageDiscount = 0, allDiscount, passangerDiscount = 0, sum = 0, ticket;

        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = input.nextInt();


        System.out.print("Yaşınızı giriniz :");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        passengerType = input.nextInt();

        if (mesafe <= 0 || age < 0 || passengerType < 1 || passengerType > 2) {
            System.out.println("Hatalı giriş yaptınız!!");
        }

        ticket =(int) (mesafe * .1);

        if ( age < 12)
            ageDiscount = (int)(ticket * .5);
        else if (age >= 12 && age <=24)
            ageDiscount = (int) (ticket * .1);
        else if(age > 65)
            ageDiscount = (int) (ticket * .3);

        allDiscount = ticket - ageDiscount;

        switch (passengerType)
        {
            case 1:
                passangerDiscount = 0 ;
                break;
            case 2:
                passangerDiscount = (int) (allDiscount * .2);
                break;
        }
        
        sum = (allDiscount - passangerDiscount) * 2 ;





        System.out.println("Toplam tutar : "+ sum);
    }
}
