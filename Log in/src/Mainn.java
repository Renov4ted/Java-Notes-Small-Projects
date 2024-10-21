import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        String user = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        String pass = input.nextLine();


        if (user.equals("patika") && pass.equals("şifre")){
            System.out.print(" Doğru giriş yaptınız!");

        } else {
            System.out.print("Bilgileriniz Yanlış!!");
        };

    }
};