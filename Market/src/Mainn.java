import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut, elma, domates, muz, patlican;


        System.out.print("Kaç Armut ? ");
        armut = input.nextDouble();
        double armutfiyat =armut * 2.14 ;

        System.out.print("Kaç Elma ? ");
        elma = input.nextDouble();
        double elmafiyat =elma * 3.67 ;

        System.out.print("Kaç Domates ? ");
        domates = input.nextDouble();
        double domatesfiyat =domates * 1.11 ;

        System.out.print("Kaç Muz ? ");
        muz= input.nextDouble();
        double muzfiyat =muz * 0.95 ;

        System.out.print("Kaç Patlıcan ? ");
        patlican= input.nextDouble();
        double patlicanfiyat =patlican * 5 ;

        double total =  (armutfiyat + elmafiyat + domatesfiyat + muzfiyat + patlicanfiyat);
        System.out.print("Toplam Tutar : "+total +" TL");
    }
}