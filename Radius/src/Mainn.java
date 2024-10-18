import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int n;
        System.out.print("Dairenin yarı çapını giriniz : ");
        n = input.nextInt();
        double cevre = 2*pi*n;
        System.out.println("Alan : " + pi*n*n );
        System.out.print("Cevre : " +cevre);
    }
}