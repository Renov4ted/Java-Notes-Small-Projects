import java.util.Scanner;
public class Mainn {

    static int prime(int sayi){

        if (sayi == 1 || sayi == 0){
            System.out.print( " Asal sayı değildir! ");
        } else if (sayi == 2 || sayi == 3 || sayi == 5 || sayi == 7) {
            System.out.print( "Asal Sayıdır! ");
        } else if (sayi % 2 == 0 || sayi % 3 == 0 || sayi % 5 == 0 || sayi % 7 == 0) {
            System.out.print(" Asal sayı değildir! ");

        } else {
            System.out.print( " Asal Sayıdır! ");
        }
        return sayi;
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz sayıyı giriniz : ");
        int sayi = input.nextInt();

        System.out.println(prime(sayi));

    }
}