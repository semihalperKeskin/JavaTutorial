import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String star = "*", space = " ";
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız üçgeni satır sayısını giriniz : ");
        x = input.nextInt();

        int spaceCount = x - 1 ;
        int starCount = 1;
        for(int i = 1; i <= x; i++)
        {
            for (int j = 0; j < spaceCount; j++ ) {
                System.out.print(space);
            }
            for (int k = 1; k < (starCount + i); k++)
            {
                System.out.print(star);
            }
            spaceCount--;
            starCount++;
            System.out.println();
        }
    }
}
