import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yas,turu;
        double mesafe,indirimsiz;
        boolean isError = false;

        System.out.println("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextDouble();

        System.out.println("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.println("Yolculuk tipini giriniz ( 1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        turu = input.nextInt();

        indirimsiz = mesafe * 0.10;

        if (turu == 1 || turu == 2 ){
            System.out.println( "Toplam tutar = " + indirimsiz + "TL");

        } else {
            System.out.println("Hatalı veri girdiniz!!!");

        }

        if (yas >=0 && yas <= 12 && turu == 1){

            System.out.print("İndirimli tutar = "+ indirimsiz / 2);
        } else if( yas >=0 && yas <= 12 && turu == 2) {

            System.out.println("İndirimli tutar = "+ (indirimsiz*30) / 100);

            } else if (yas >= 12 && yas <= 24 && turu == 2){
            System.out.println("İndirimli tutar = " +(indirimsiz * 70) / 100 );
        }

            else if  ((yas >= 12 && yas <= 24 && turu == 1)){
                System.out.println("İndirimli tutar = " + (indirimsiz * 90) / 100);

            } else if ((yas >= 24 && yas <= 65 && turu == 1)) {

        } else if ((yas >= 24 && yas <=65 && turu == 2)) {
            System.out.println("İndirimli tutar = " + (indirimsiz * 80) / 100);

        } else if (yas >= 65 && turu ==1) {
            System.out.println("İndirimli tutar = " + (indirimsiz * 70) / 100);

        } else if (yas >= 65 && turu ==2){
            System.out.println("İndirimli tutar = " + indirimsiz / 2);
        } else  {
            System.out.println("Yanlış veri girdiniz!");
        }
    }
};