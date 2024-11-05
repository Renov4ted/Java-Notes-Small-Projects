import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int selectNumber = 0;

        int count = 0;
        System.out.println("Sayınızı giriniz!");
        selectNumber = input.nextInt();
        count = pattern(selectNumber);

        System.out.println(sum(count, selectNumber));


        input.close();

    }
    static int pattern(int x){
        if(x <= 0){
            return x;
        }

        System.out.print(x + " ");
        return pattern(x-5);
    }
    static int sum(int x, int y){
        if (x != y){
            System.out.print(x + " ");
            return sum(x+5, y);
        }
        return x;
    }
}