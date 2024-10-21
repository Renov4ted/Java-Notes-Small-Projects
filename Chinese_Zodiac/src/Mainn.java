import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int yil,kalan;

        System.out.println("Doğum yılınızı giriniz");
        yil = input.nextInt();

        kalan = (yil % 12 );

        System.out.println(kalan);

        switch (kalan){
            case 0:
                System.out.println("Maymun");
                break;
            case 1:
                System.out.println("Horoz");
            case 2:
                System.out.println("Köpek");
                break;
            case 3:
                System.out.println("Domuz");
            case 4:
                System.out.println("Fare");
                break;
            case 5:
                System.out.println("Öküz");
                case 6:
                System.out.println("Kaplan");
                break;
            case 7:
                System.out.println("Tavşan");
                case 8:
                System.out.println("Ejderha");
                break;
            case 9:
                System.out.println("Yılan");
                case 10:
                System.out.println("At");
                break;
            case 11:
                System.out.println("Koyun");
            break;
        }
    }
};