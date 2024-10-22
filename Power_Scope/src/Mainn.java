import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sayi;
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i*=4 ){
            System.out.println(i);
        }
        System.out.println("----------------");
        for (int i = 1; i <= sayi; i*=5 ){
            System.out.println(i);
        }
    }
};