import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Fibonacci serisi sayısını giriniz : ");
    int sayi = input.nextInt();
    int n1 =0, n2=1;

    for (int i =2; i <= sayi; i++){
            int yeni = n1 + n2 ;
            System.out.println(""+ yeni);
            n1 = n2;
            n2 = yeni;
        }
    }
}