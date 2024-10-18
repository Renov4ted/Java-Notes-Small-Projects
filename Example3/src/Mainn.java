import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi1'i giriniz : ");
        int sayi1 = input.nextInt();
        int kare1 = sayi1*sayi1;
        System.out.println("1.Sayınız : " +kare1);
        System.out.print("Sayı2'i giriniz : ");
        int sayi2 = input.nextInt();
        int kare2 = sayi2*sayi2;
        System.out.println("2.Sayınız: " + kare2);

        int sayi3 = kare1 +kare2;
        System.out.print("Son Sayı : ");
        System.out.println(sayi3);
    }
}

