import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month, day;

    System.out.print("Doğum ayınızı giriniz : ");
    month = input.nextInt();
    System.out.print("Doğum gününüzü giriniz : ");
    day = input.nextInt();
    switch (month){
        case 1:

        if (day <= 21) {
            System.out.println("Oğlak burcu");
        } else {
            System.out.println("Kova burcu");
        }
        break;
        default:
            System.out.println("Hatalı bir ay girdiniz");

        case 2:

        if (day <= 19){
            System.out.println("Kova burcu");
        } else {
            System.out.println("Balık burcu");
        }
            break;
        case 3:

            if (day <= 20){
                System.out.println("Balık burcu");
            } else {
                System.out.println("Koç burcu");
            }
            break;
        case 4:

            if (day < 20){
                System.out.println("Koç burcu");

            } else {
                System.out.println("Boğa burcu");
            }
            break;
        case 5:

            if (day < 21){
                System.out.println("Boğa burcu");
            } else {
                System.out.println("İkizler burcu");
            }
            break;
        case 6:

            if (day < 22){
                System.out.println("İkizler burcu");
            } else {
                System.out.println("Yengeç burcu");
            }
            break;
        case 7:

            if (day < 22) {
                System.out.println("Yengeç burcu");
            } else {
                System.out.println("Aslan burcu");
            }
            break;
        case 8:

            if (day < 22){
                System.out.println("Aslan burcu");
            } else {
                System.out.println("Başak burcu");
            }
            break;
        case 9:

            if (day < 22) {
                System.out.println("Başak burcu");
            } else {
                System.out.println("Terazi burcu");
            }
            break;
        case 10:

            if (day < 22){
                System.out.println("Terazi burcu");
            } else {
                System.out.println("Akrep burcu");
            }
            break;
        case 11:

            if (day < 23){
                System.out.println("Akrep burcu");
            }else {
                System.out.println("Yay burcu");
            }
            break;
        case 12:

            if (day < 21){
                System.out.println("Yay burcu");
            }else {
                System.out.println("Oğlak burcu");
            }
    }


    }
};