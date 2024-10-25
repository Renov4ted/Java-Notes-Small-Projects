import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();

        System.out.println("n2 Sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob=1,ekok=1;

            for (int i=1; i <= n1; i++){
                if (n1 % i == 0 && n2 % i == 0){
                    ebob = i;
                }
            }

        System.out.println("Ebob = "+ ebob);
        ekok = n1*n2 / ebob;
        System.out.println("Ekok:" + ekok);


    }
};