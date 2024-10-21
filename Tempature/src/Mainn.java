import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int sicaklik;
      System.out.print("Hava derecenisini giriniz : ");
      sicaklik = input.nextInt();
      if (sicaklik <= 5){
            System.out.print("Kayak yap!");
        } else if (sicaklik >=5 && sicaklik <=15) {
          System.out.print("Sinemaya git!");
      } else if (sicaklik >=15 && sicaklik <=25) {
          System.out.print("Pikniğe git!");
      }else {
          System.out.print("Yüzmeye git!!!!");
      }

    }
};