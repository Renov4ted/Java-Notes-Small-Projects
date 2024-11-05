import java.util.Scanner;
public class Mainn {


    static int total(int taban, int us){
        int result = 1;
        for (int i = 1; i <= us; i++){
            result *= taban;
            System.out.println(i +". Üslü sayı değeriniz : " + result);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz : ");
        int taban = input.nextInt();

        System.out.print("üssü giriniz : ");
        int us = input.nextInt();

        System.out.println(total(taban,us));

    }
}