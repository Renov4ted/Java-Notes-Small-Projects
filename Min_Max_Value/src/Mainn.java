import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz : ");

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int sayi = input.nextInt();
        int ilkdeger = sayi;
            for(int i =1; i <= ilkdeger; i++){
                System.out.print(i+". Sayıyı giriniz : ");
                sayi = input.nextInt();

            if (sayi>largest){
                largest = sayi;

            }
            if (sayi < smallest){
                smallest = sayi;
            }

            }
        System.out.println("En büyük sayı: " + largest);
        System.out.println("En kücük Sayı : " + smallest);
    }
};