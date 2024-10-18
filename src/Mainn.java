import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mat Puanınızı giriniz : ");
        int deger1 = input.nextInt();
        System.out.print("Fizik Puanınızı giriniz : ");
        int deger2 = input.nextInt();
        System.out.print("Kimya Puanınızı giriniz : ");
        int deger3 = input.nextInt();
        System.out.print("Turkce Puanınızı giriniz : ");
        int deger4 = input.nextInt();
        System.out.print("Tarih Puanınızı giriniz : ");
        int deger5 = input.nextInt();
        System.out.print("Müzik Puanınızı giriniz : ");
        int deger6 = input.nextInt();

        int sonuc = deger1 + deger2 + deger3 + deger4 + deger5 + deger6;
        System.out.println(sonuc);
        System.out.println("Toplamınız : " + sonuc);

        System.out.println("Ortalamanız : " + sonuc / 6);
        String durum = sonuc / 6 >= 50 ? "geçtiniz " : "kaldınız ";
        System.out.println(durum);
    }
}