import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int n1,n2,select;
        System.out.print("ilk sayıyı giriniz : ");
        n1 = input.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();
        System.out.println("seçiminiz " + select);

        if (select == 1){
            System.out.println(n1 + n2);
        } else if (select == 2) {
            System.out.println( n1 - n2);

        } else if (select == 3) {
            System.out.println(n1 * n2);

        } else if (select == 4 ) {
            System.out.println(n1 / n2);
        }

    }
    };