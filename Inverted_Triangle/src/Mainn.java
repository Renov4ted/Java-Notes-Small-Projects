import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi = input.nextInt();

       for (int i = sayi; i > 0; i--){
           for (int k =0; k < i; k++){
               System.out.print("*");
           }
           System.out.println("");
       }

    }
};