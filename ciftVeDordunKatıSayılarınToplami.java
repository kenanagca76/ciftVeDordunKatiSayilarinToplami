package ciftVeTekSayiToplami;

import java.util.Scanner;

public class ciftSayiToplami {
    public static void main(String[] args) {
        int k;
        int total = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Bir Sayı Giriniz : ");
            k = input.nextInt();

            if (k % 4 == 0) {
                total += k;
            }
        } while (k % 2 == 0);
        System.out.println();
        System.out.print("\n" + "Girilen sayılarda hem çift sayı hem de 4'e tam bölünebilen sayıların toplamı: " + total + "");
    }
}
