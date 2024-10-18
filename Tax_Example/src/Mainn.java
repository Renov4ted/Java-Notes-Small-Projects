import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fiyat giriniz :");
        double fiyat = input.nextDouble();
        double kdv = 0.18;
        double toplam = fiyat + kdv*fiyat;

        System.out.println("KDV'siz fiyat : " +fiyat);
        System.out.println("KDV'li fiyat : " +toplam);
        System.out.println("KDV tutarı : " +kdv);
    }
}