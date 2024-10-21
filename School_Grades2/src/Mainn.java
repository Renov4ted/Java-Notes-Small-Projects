import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int mat,fizik,turkce,kimya,muzik,toplam;

        System.out.print("Matematik notunuzu giriniz : ");
       mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
       fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz : ");
       turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
       kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
       muzik = input.nextInt();

       toplam = mat + fizik + turkce + kimya + muzik;

       if (toplam / 5 <= 55){
           System.out.println("Kaldınız!!");

       }else {
           System.out.println("Geçtiniz!!");
       }
           System.out.print("Ortalamanız : " + toplam / 5);

    }
};