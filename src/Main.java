import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı alınır
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Çarpanların toplamını hesaplamak için bir değişken tanımlanır
        int toplam = 0;

        // Sayının çarpanlarını kontrol et
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }

        // Sonucu ekrana yazdır
        if (toplam == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
    }
}
