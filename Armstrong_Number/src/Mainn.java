import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sayi,numberCounter = 0,tempNumber, result = 0, basPow;
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        tempNumber = sayi;
        int basValue;

        while (tempNumber != 0){
            tempNumber /= 10;
            numberCounter++;
        }
        tempNumber = sayi;

        while (tempNumber != 0){
            basValue = tempNumber %10;
            basPow = 1;
            for (int i= 1; i <= numberCounter; i++){
              basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }
        if (result == sayi){
            System.out.println("Sayınız Armstrong sayısıdır : " + result);
        } else {
            System.out.println("Sayını Armstrong sayısı Değildir.");
        }
    }
};