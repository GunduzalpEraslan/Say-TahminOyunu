import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


class SayıTahminiOyunu {
    public static void main(String[] args){
        Random rand = new Random();
        double number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        while(right < 5){
            System.out.println("Lütfen tahminini biliniz : ");
            selected = input.nextInt();
            if (selected<0 || selected>99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz. ");
                continue;

            }
            if (selected==number){
                System.out.println("Tebrikler, Tahmin ettiğiniz sayı doğrudur! " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected>number){
                    System.out.println(selected + " sayısı, tahmin edilecek sayıdan büyüktür. ");
                } else {
                    System.out.println(selected + " sayısı, tahmin edilecek sayıdan küçüktür.");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hak sayısı : " + (5-right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahmin ettiğiniz sayılar"+ Arrays.toString(wrong));
            System.out.println("Tahmin edilemeyen sayı : " + number);
        }
    }

}
