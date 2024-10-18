import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        double base = 10, totalUcret, km=2.20;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi yazınız : ");
        int mesafe = input.nextInt();

        totalUcret = (mesafe * km);
        totalUcret += base;
        totalUcret = (totalUcret < 20) ? 20 : totalUcret;

        System.out.println("Mesafeniz : " + mesafe);
        System.out.println("Toplam Ücret : "+ totalUcret);



    }
}

