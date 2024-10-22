import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sayi;
    int total = 0;
     System.out.print("Sayı giriniz : ");
     sayi = input.nextInt();

     while (sayi >= 0){
         System.out.print("Sayı giriniz : ");
         sayi = input.nextInt();

         if (sayi %2 == 1){
              total += sayi;
         }

         else if (sayi < 0){
                  System.out.println("işlem bitti : " + total);
              }
     }
    }
};