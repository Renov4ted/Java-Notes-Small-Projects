import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int yilkontrol1;


        System.out.print("Hesaplamak istediğiniz yılı girin : ");


        yilkontrol1 = input.nextInt();
        if (yilkontrol1 %4 ==0 && yilkontrol1 %100==0 ){
            System.out.println("Artık yıl");
        } else {
            System.out.println("Artık yıl Değil");
        }
    }
};