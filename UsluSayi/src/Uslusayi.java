import java.util.Scanner;
public class Uslusayi {
    public static void main(String[] args) {
        int sayi, us, total;
        total = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üssünü giriniz: ");
        us = input.nextInt();

        for (int i=1; i<= us; i++){
            total = total*sayi;

        }
        System.out.println(total);
    }
}
