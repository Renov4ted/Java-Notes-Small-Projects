import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n,k;
        System.out.print("Üssü alınacak sayıyı girin : ");
        n=input.nextInt();

        System.out.print("Üssü seçiniz : ");
        k=input.nextInt();

        int toplam = 1;
        for (int i = 1; i <= k; i++ ){

        toplam *= n;
        }
            System.out.println("Toplam : " +toplam);

    }
};