import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Sayınızı girini : ");
        int sayi = input.nextInt();
        int toplam = 1;

        for (int i = 1; i <= sayi; i++){
            toplam = toplam * i;

        }
            System.out.println( sayi + " Faktöriyel : " + toplam ); ;
    }
};