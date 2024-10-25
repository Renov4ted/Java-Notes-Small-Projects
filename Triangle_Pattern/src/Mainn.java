import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        System.out.print("Satır sayınızı giriniz : ");

        int satir = input.nextInt();


        for (int i = 1; i <= satir; i++){
            for (int k = 1; k<= (satir - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) - 1; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
};