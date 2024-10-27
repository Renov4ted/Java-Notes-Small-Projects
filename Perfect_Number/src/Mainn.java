import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();
        int yenideger =0;
        for (int i =1; i < sayi; i++){
            if (sayi % i == 0){
                yenideger += i;
            }
            }
                if (yenideger == sayi){
                    System.out.println(yenideger+ " Mükemmel sayıdır");
                } else {
                    System.out.println(sayi + " Mükemmel sayı değildir");
                }
    }
};