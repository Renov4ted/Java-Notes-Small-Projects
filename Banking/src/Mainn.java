import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String userName, password;
    int islem, balance = 1500, gelen,giden, kalanHak = 3;
     while (kalanHak > 0){

        System.out.print("\nBankaya hoşgeldiniz! Kullanıcı adınızı giriniz : ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz : ");
        password = input.nextLine();

        if (userName.equals("Software")  && password.equals("Developer123")){
            System.out.print("Hoşgeldiniz ! Yapmak istediğiniz işlemi seçiniz.");

            boolean exit = false;
            while (!exit){
                System.out.println("\n 1-Para yatırma\n 2-Para çekme \n 3-Bakiye sorgulama \n 4-Çıkış yap\n");
            islem = input.nextInt();

            switch (islem){
                case 1:
                    System.out.print("Yatırmak istediğiniz parayı yerleştiriniz : ");
                    gelen = input.nextInt();
                    balance += gelen;
                    System.out.println("Başarılı! Yeni bakiyeniz : " + balance);
                    break;
                case 2:
                    System.out.print("Ne kadar para çekmek istiyorsunuz ? : ");
                    giden = input.nextInt();
                    if (giden > balance){
                        System.out.println("Bakiye yetersiz Tekrar tuşlama yapınız");
                    } else {
                    balance -= giden;
                    System.out.print("Başarılı! Yeni bakiyeniz : " + balance);
                    }
                    break;
                 case 3:
                    System.out.print("Bakiyenizdeki Miktar : " + balance);
                     break;
                case 4:
                    System.out.print("Başarıyla çıkış yapıldı!");
                    exit = true;
                    break;

                default:
                    System.out.println("Geçersiz tuşlama, tekrar deneyiniz.");
                    break;
            }
            }
        }
        else {
            kalanHak--;
            if (kalanHak ==0 ){
                System.out.println("Hesabınız Bloke olmuştur.");
                break;
            }
            System.out.print("Yanlış giriş yaptınız!! Tekrar deneyiniz Kalan Hak : " +kalanHak);
        }
    }
    }
};