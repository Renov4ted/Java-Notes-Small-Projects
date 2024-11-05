import java.util.Scanner;
public class Mainn {

    static int sum (int a, int b){
        int result = a + b;
        System.out.println("Toplam : " + result );
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma : " + result);
        return result;

    }
    static int times(int a, int b){
        int result = a * b;
        System.out.println("Çarpım : " + result);
        return result;
    }
    static int divide(int a, int b){
        if (b == 0){
            System.out.print("İkinci sayı 0'dan farklı olmalı!");
        return 0;
        }
        int result = a / b;
        System.out.println("Bölüm" + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i =1; i <= b; i++){
            result *= a;
        }
            System.out.println("Üs" + result);
            return result;
    }
    static int mod(int a, int b){
        return a % b;
    }
    static void square(int a, int b){
        System.out.println("Çevresi : "+ (2*(a+b)));
        System.out.println("Alanı : "+ (a*b));
    }

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int select;

        String menu = "1- Toplama\n"
                +"2- Çıkarma\n" +
                "3- Çarpma\n" +
                "4- Bölme\n"+
                "5- üslü sayı hesapla\n"+
                "6- Mod alma\n"+
                "7- Dikdörtgen Alan ve Çevre hesabı\n"+
                "0- Çıkış yap";


            while (true){
                System.out.println(menu);
                System.out.print("İşlem seçiniz : ");
                select = input.nextInt();
                if (select == 0){
                    break;
                }
                System.out.print("1. Sayıyı girin : ");
                    int a = input.nextInt();
                System.out.print("2. Sayıyı girin : ");
                    int b = input.nextInt();
                switch (select){
                    case 1:
                        sum(a,b);
                    break;

                    case 2:
                        minus(a,b);
                        break;

                    case 3:
                        times(a,b);
                        break;

                    case 4:
                        divide(a,b);
                        break;

                    case 5:
                        power(a,b);
                        break;

                    case 6:
                        System.out.println("Mod işlemi "+ mod(a,b));
                        break;

                    case 7:
                    square(a,b);
                        break;

                    default:
                        System.out.println("Geçersiz işlem girdiniz");
                }
    }
    }
}